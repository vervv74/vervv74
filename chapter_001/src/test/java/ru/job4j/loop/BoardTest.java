package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 25.10.2017.
 */
public class BoardTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    public void strThreetoThree() {
        Board str = new Board();
        String result = "x x" + "\r\n" + " x " + "\r\n" + "x x" + "\r\n";
        assertThat(result, is(str.paint(3, 3)));
    }

    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 25.10.17
     */
    public void strFivetoFour() {
        Board str = new Board();
        String result = "x x x" + "\r\n" + " x x " + "\r\n" + "x x x" + "\r\n" + " x x " + "\r\n";
        assertThat(result, is(str.paint(5, 4)));
    }

}
