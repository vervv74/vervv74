package ru.job4j.calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 15.10.17
*/
public class CalculatorTest {
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
	@Test
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
	  public void whenThreeSubstractOneThenTwo() {
        Calculator calc = new Calculator();
        calc.substract(3, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
	 public void whenThreeDivOneThenTHtee() {
        Calculator calc = new Calculator();
        calc.div(3, 1);
        double result = calc.getResult();
        double expected = 3;
        assertThat(result, is(expected));
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
	 public void whenSixMultipleTwoThenTwelve() {
        Calculator calc = new Calculator();
        calc.multiple(6, 2);
        double result = calc.getResult();
        double expected = 12;
        assertThat(result, is(expected));
    }
}