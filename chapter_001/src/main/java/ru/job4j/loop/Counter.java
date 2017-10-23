package ru.job4j.loop;

/**
 * Created by v.verkhovykh on 24.10.2017.
 */
public class Counter {
    /**
     * @param start  начало
     * @param finish конец
     * @return максимум
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method add
     * @since 24.10.17 новый
     */
    public int add(int start, int finish) {
        int counter = 0;
        for (int a = start; a <= finish; a++)
            if (a % 2 == 0) {
                counter +=a;
            }
        return counter;
    }
}
