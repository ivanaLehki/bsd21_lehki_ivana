package at.campus02.bsd;

public class Calculator
{
    public double add(double number1, double number2){
        double sum = number1 + number2;

        return sum;
    }

    public double minus(double number1, double number2){
        double result = number1 - number2;
        return result;
    }

    public double divide(double number1, double number2){
        double division = number1 / number2;
        return division;
    }

    public double multiply(double number1, double number2){
        double multiply = number1 * number2;
        return multiply;
    }

    public int faculty(int n){
        if (n < 0){
            return 0;
        }
        else if (n >= 0 && n <= 1){
            return 1;
        }

        else
            n *= faculty(n-1);
            return n;
    }
}
