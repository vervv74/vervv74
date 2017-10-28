package ru.job4j.array;

/**
 * Created by v.verkhovykh on 26.10.2017.
 */
public class Turn {
    /**
     * @param array  массив
     * @return перевернутый массив
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method back
     * @since 26.10.17 новый
     */
    public int[] back(int[] array){
        for (int i = 0; i <= array.length/2-1; i++) {
            int a = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=a;
        }
        return array;
    }
}
