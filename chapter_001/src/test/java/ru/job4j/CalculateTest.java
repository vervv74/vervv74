/**
* First class
*/
package ru.job4j;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 15.10.17
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Valentin Verkhovykh";
    String expect = "Echo, echo, echo : Valentin Verkhovykh";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 }