package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 22.11.2017.
 */
public class SortTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 22.11.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 22.11.17
     */
    public void plusTest(){
        Sort sort=new Sort();
        int[] qwe1 = {1, 3, 5};
        int[] qwe2= {2, 4, 6, 8, 10};
        int[] result={1,2,3,4,5,6,8,10};
        assertThat(result, is(sort.Plus(qwe1, qwe2)));
    }
}
