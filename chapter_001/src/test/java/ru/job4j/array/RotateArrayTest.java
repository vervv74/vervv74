package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 27.10.2017.
 */
public class RotateArrayTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 27.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 27.10.17
     */
    public void rotateArrayTwo() {
        RotateArray arr = new RotateArray();
        int[][] top = {{1, 2}, {3, 4}};
        int[][] result = {{1, 3}, {2, 4}};
        assertThat(result, is(arr.rotate(top)));
    }
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 27.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 27.10.17
     */
    public void rotateArrayThree() {
        RotateArray arr = new RotateArray();
        int[][] top = {{1, 2,3}, {4, 5,6},{7, 8,9}};
        int[][] result = {{1, 4,7}, {2, 5,8},{3, 6,9}};
        assertThat(result, is(arr.rotate(top)));
    }
}
