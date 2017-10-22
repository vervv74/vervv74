package ru.job4j.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
 * @since 15.10.17
 */
public class MaxTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 20.10.17
     */
    @Test
/**
 * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
 * @since 20.10.17
 */
    public void maxOneorTwo() {
        Max calc = new Max();
        int result = calc.max(1, 2);
        assertThat(result, is(2));
    }
}
