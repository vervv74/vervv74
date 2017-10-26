package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 26.10.2017.
 */
public class BubbleSortTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 26.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 26.10.17
     */
    public void evenTurnArray(){
        BubbleSort sort = new BubbleSort();
        int[] top={5, 1, 2, 7, 3};
        int[] result={1, 2, 3, 5, 7};
        assertThat(result, is(sort.bubbleSort(top)));
    }
}
