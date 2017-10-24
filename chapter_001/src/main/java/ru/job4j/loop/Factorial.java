package ru.job4j.loop;

/**
 * Created by v.verkhovykh on 24.10.2017.
 */
public class Factorial {
    /**
     * @param n аргумент
     * @return факториал
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method add
     * @since 24.10.17 новый
     */
    public int calc(int n) {
        int rsl = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= Math.abs(n); i++) {
                rsl = rsl * i;
            }
            return rsl;
        }
    }
}
