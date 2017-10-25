package ru.job4j.loop;

/**
 * Created by v.verkhovykh on 25.10.2017.
 */
public class Paint {
    /**
     * @param height высота пирамиды
     * @return строка
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method paint
     * @since 25.10.17 новый
     */
    public static String paint(int height) {
        StringBuilder str = new StringBuilder();
        for (int i = height; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                str.append(" ");
            }
            for (int q = 2 * height - 2 * i + 1; q >= 1; q--) {
                str.append("^");
            }
            for (int j1 = i - 1; j1 >= 1; j1--) {
                str.append(" ");
            }
            str.append("\r\n");
        }
        return str.toString();
    }
}
