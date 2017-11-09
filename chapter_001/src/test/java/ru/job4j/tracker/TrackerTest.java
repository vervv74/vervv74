package ru.job4j.tracker;

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
    public void addAndfind() {
        Tracker tracker = new Tracker();
        Item item = new Item(0, "123", "1234");
        tracker.add(item);
        assertThat(tracker.findByID(0), is("0"));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    public void addAndDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item(0, "123", "1234");
        Item item1= new Item(1, "123", "1234");
        tracker.add(item);
        tracker.add(item1);
        tracker.delete(1);
        assertThat(tracker.findPozition(1), is(0));
    }
    @Test
    /**
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * @since 16.11.17
     */
    public void addAndUpdate() {
        Tracker tracker = new Tracker();
        Item item = new Item(0, "123", "1234");
        Item item1= new Item(1, "123", "1234");
        tracker.add(item);
        tracker.add(item1);
        tracker.update(1, 0);
        assertThat(tracker.findPozition(1), is(0));
    }
}
