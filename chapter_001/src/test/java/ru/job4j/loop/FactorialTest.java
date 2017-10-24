package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 24.10.2017.
 */
public class FactorialTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 24.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 24.10.17
     */
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial fct = new Factorial();
        assertThat(fct.calc(5), is(120));
    }

    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 24.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 24.10.17
     */
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial fct = new Factorial();
        assertThat(fct.calc(0), is(1));
    }
}
