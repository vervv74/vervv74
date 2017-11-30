package ru.job4j.tracker1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by v.verkhovykh on 30.11.2017.
 */
public class StartUITest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 30.11.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 30.11.17
     */
    public void addItem(){
        Tracker tracker = new Tracker();
        Input input = new Input(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
}
