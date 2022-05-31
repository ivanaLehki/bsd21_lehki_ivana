package at.campus02.bsd;

/**
 * Calculator class
 * @authors Ivana Lehki
 */
public class Calculator
{
    /**
     *
     * @param number1
     * @param number2
     * @return sum as double value after the numbers have been added
     */
    public double add(double number1, double number2){
        double sum = number1 + number2;

        return sum;
    }

    /**
     *
     * @param number1
     * @param number2
     * @return result as double value after the numbers have been substractet
     */
    public double minus(double number1, double number2){
        double result = number1 - number2;
        return result;
    }

    /**
     *
     * @param number1
     * @param number2
     * @return division as double value after the numbers have been divided
     */
    public double divide(double number1, double number2){
        double division = number1 / number2;
        return division;
    }

    /**
     *
     * @param number1
     * @param number2
     * @return multiply as double value after the numbers have been multiplied
     */
    public double multiply(double number1, double number2){
        double multiply = number1 * number2;
        return multiply;
    }

    /**
     *
     * @param n
     * @return n as an integer after the faculty of n has been calculated
     */
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
