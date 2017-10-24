package ru.job4j.max;

/**
 * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
 * @since 21.10.17 ggg
 */
public class Max {
    /**
     * @param first  первое слагаемое
     * @param second второе слагаемое
     * @return максимум
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method add
     * @since 20.10.17 новый
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }
    public int max(int first, int second, int third) {
        return this.max(this.max(first,second),third);
    }
}
