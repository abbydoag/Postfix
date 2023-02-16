package HDT2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	private static String readData(String dataFile) throws FileNotFoundException {
		BufferedReader dataScan = new BufferedReader(new FileReader(dataFile));
		String data = "";
		
		try { 
			data = dataScan.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);		
		return data;
	}
	public static void main(String[]args) throws FileNotFoundException{
		String operation = readData("src/HDT2/datos.txt");
		String equalsTo = operateData(operation);
		System.out.println("Resultado de la operación: "+equalsTo);
		}
	private static String operateData(String operation){
		Calculate calculate = new Calculate();
		Stack<Float> stack = new Stack<Float>();
		System.out.println("size: " + operation.length());
		for (int i=0; i < operation.length(); i++) {
			char character = operation.charAt(i);
			if(character == ' ') {
				continue;
			}
			if (Character.isDigit(character)){
				String c = "" + character;
				float parsedNumber = Float.parseFloat(c);
				stack.push(parsedNumber);
			}else {
				if (stack.size()<2) {
					   return "Elementos insuficientes para realizar operaciones";
				   }
			    float number1 = stack.pop();
			    float number2 = stack.pop();
			    
				switch(character) {
				case '+':
					stack.push(calculate.sum(number2,number1));
					break;
				case '-':
					stack.push(calculate.substract(number2, number1));
					break;
				case '*':
					stack.push(calculate.multiply(number2, number1));
					break;
				case '/':
					float answer = calculate.divition(number1, number2);
					if (Float.isInfinite(answer) || Float.isNaN(answer)){
						return "Error en la división por uso de 0 o un valor no válido";
					}
					stack.push(answer);
					break;
				default:
					return "Caracter inválido detectado";
				}
			}
		}
		
		if (stack.size() > 1) {
			return "Insuficientes operadores en la expresión";
		}
		return String.valueOf(stack.pop());
	}
}