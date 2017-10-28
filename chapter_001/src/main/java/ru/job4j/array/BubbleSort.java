package ru.job4j.array;

/**
 * Created by v.verkhovykh on 26.10.2017.
 */
public class BubbleSort {
    /**
     * @param arr  массив
     * @return сортированный массив
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method bubbleSort
     * @since 26.10.17 новый
     */
    public int[]bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
