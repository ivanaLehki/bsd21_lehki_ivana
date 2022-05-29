package at.campus02.bsd.calculator;

import at.campus02.bsd.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class CalcTest
{
    Calculator calc;


    @BeforeEach
    public void setup() throws IOException{
        calc = new Calculator();
    }

    double result;
    @Test
    public void add(){
        Assertions.assertEquals(8, 5+3);

        result = 5 + 3;
        Assertions.assertEquals(result, calc.add(5, 3));
    }

    @Test
    public void multiply(){
        Assertions.assertEquals(15, 5*3);

        result = 5 * 3;
        Assertions.assertEquals(result, calc.multiply(5, 3));
    }

    @Test
    public void divide(){
        Assertions.assertEquals(5, 15/3);

        result = 15 / 3;
        Assertions.assertEquals(result, calc.divide(15, 3));
    }

    @Test
    public void minus(){
        Assertions.assertEquals(2, 5-3);

        result = 5 - 3;
        Assertions.assertEquals(result, calc.minus(5, 3));
    }

    @Test
    public void faculty(){
        Assertions.assertEquals(1, calc.faculty(0));
        Assertions.assertEquals(0, calc.faculty(-1));
        Assertions.assertEquals(6, calc.faculty(3));


    }



}
