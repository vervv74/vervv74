package ru.job4j.tracker;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by v.verkhovykh on 09.11.2017.
 */
public class TrackerTest {
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    public void addAndfindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("123", "1234");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    public void addAndfindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("123", "1234");
        tracker.add(item);
        assertThat(tracker.findByName("123"), is(item));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    public void addAndfindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("123", "1234");
        tracker.add(item);
        tracker.findAll()[0].setId(4);
        assertThat(tracker.findById(4), is(item));
    }
}
