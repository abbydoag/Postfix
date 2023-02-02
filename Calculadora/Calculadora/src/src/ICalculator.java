package src;
public interface ICalculator {    
    static float Add (float number1, float number2) {
        return number1+number2;
    }
    static float Substraction(float number1, float number2) {
        return number1-number2;
    }
    static float Multiply(float number1, float number2) {
        return number1*number2;
    }
    static float Divition(float number1, float number2) {
        return number1/number2;
    }
}