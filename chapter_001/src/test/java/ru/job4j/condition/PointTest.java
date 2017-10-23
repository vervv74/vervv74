package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 23.10.2017.
 */
public class PointTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 23.10.17
     */
    @Test
/**
 * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
 * @since 23.10.17
 */
    public void tryFunction() {
        Point point = new Point(3, 4);
        boolean result = point.is(1, 1);
        assertThat(result, is(true));
    }
}
