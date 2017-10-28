package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by v.verkhovykh on 26.10.2017.
 */
public class TurnTest {
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
        Turn turn = new Turn();
        int[] top={1,2,3,4,5};
        int[] result={5,4,3,2,1};
        assertThat(result, is(turn.back(top)));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 26.10.17
     */
    public void unevenTurnArray(){
        Turn turn;
        turn = new Turn();
        int[] top={4,1,6,2};
        int[] result={2,6,1,4};
        assertThat(result, is(turn.back(top)));
    }
}
