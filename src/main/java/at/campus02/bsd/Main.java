package at.campus02.bsd;

public class Main
{
    public static void main(String[] args)
    {
        double num1 = 12.0;
        double num2 = 2.0;

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.minus(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        System.out.println(calculator.multiply(num1, num2));


    }
}
