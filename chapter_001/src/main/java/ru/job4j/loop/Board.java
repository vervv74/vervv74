package ru.job4j.loop;

/**
 * Created by v.verkhovykh on 25.10.2017.
 */
public class Board {
    /**
     * @param width  ширина
     * @param height высота
     * @return строка
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method paint
     * @since 25.10.17 новый
     */
    public static String paint(int width, int height) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= height - 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= width - 1; j++) {
                    if (j % 2 == 0) {
                        str.append("x");
                    } else {
                        str.append(" ");
                    }
                    if (j == width - 1) {
                        str.append("\r\n");
                    }
                }
            } else {
                for (int j = 0; j <= width - 1; j++) {
                    if (j % 2 != 0) {
                        str.append("x");
                    } else {
                        str.append(" ");
                    }
                    if (j == width - 1) {
                        str.append("\r\n");
                    }
                }
            }
        }
        return str.toString();
    }
}
