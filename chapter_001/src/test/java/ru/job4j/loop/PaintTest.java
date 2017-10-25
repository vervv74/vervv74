package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 25.10.2017.
 */
public class PaintTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    public void strHeightTwo() {
        Paint str = new Paint();
        String separator = System.getProperty("line.separator");
        String result = " ^ " + separator + "^^^" + separator;
        assertThat(result, is(str.paint(2)));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    public void strHeightTHree() {
        Paint str = new Paint();
        String separator = System.getProperty("line.separator");
        String result = "  ^  " + separator + " ^^^ " + separator + "^^^^^" + separator;
        assertThat(result, is(str.paint(3)));
    }
}
