package ru.job4j.array;

/**
 * Created by v.verkhovykh on 27.10.2017.
 */
public class RotateArray {
    /**
     * @param array  массив
     * @return перевернутый массив
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method rotate
     * @since 27.10.17 новый
     */
    public int[][] rotate(int[][] array) {
        int[][] array1 = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1[j][i] = array[i][j];
            }
        }
        return array1;
    }
}
