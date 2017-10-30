package ru.job4j.control;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by v.verkhovykh on 30.10.2017.
 */
public class ControlQwestTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 30.10.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 30.10.17
     */
    public void checkStringsTrue(){
        ControlQwest check1 = new ControlQwest();
        assertThat(true, is(check1.check("Вотмойтест","мой")));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 30.10.17
     */
    public void checkStringsFalse(){
        ControlQwest check1 = new ControlQwest();
        assertThat(false, is(check1.check("УраПраздник","празд")));

    }
}
