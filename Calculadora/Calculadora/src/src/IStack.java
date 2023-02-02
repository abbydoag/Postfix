package src;
import java.io.*;
import java.util.*;
public class IStack <T> {
    public static void main(String[] args) throws Exception {
        /**
         * Para leer los datos del datos.txt y ver los numeros a operar
         */
        Scanner txtScanner = new Scanner(new File ("datos.txt"));
        String postfix = txtScanner.next();
        Stack stack = new Stack(); 
        while(txtScanner.hasNext()){
            for(int i = 0; i < postfix.length(); i++){
                char a = postfix.charAt(i);
                
                if(a == ' ')
                continue;
                float number1=0;
                float number2=0;
                if(Character.isDigit(a)){
                    float number = Character.getNumericValue(a);
                    stack.push(number);
                }
                else{
                    /*
                     * Operaciones de interfaz
                     */
                    stack.pop();
                    switch (a){
                        case '+':
                        stack.push(ICalculator.Add(number1,number2));
                        break;
                        case '-':
                        stack.push(ICalculator.Substraction(number1,number2));
                        break;
                        case '*':
                        stack.push(ICalculator.Multiply(number1,number2));
                        break;
                        case '/':
                        stack.push(ICalculator.Divition(number1,number2));
                        break;
                    }                    
                    stack.pop();
                    return;
                }
            }
            
        }
    }    
}

