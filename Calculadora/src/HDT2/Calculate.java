package HDT2;
//Operaciones
public class Calculate implements ICalculate{
	@Override
	public float sum(float number1, float number2) {
		return number1+number2;
	}
	@Override
	public float substract(float number1, float number2) {
		return number1-number2;
	}
	@Override
	public float multiply(float number1, float number2) {
		return number1*number2;
	}
	@Override
	public float divition(float number1, float number2) {
		return number1/number2;
	}	
}
