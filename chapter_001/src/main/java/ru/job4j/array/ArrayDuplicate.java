package ru.job4j.array;

import java.util.Arrays;

/**
 * Created by v.verkhovykh on 27.10.2017.
 */
public class ArrayDuplicate {
    /**
     * @param array  массив
     * @return перевернутый массив
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method back
     * @since 27.10.17 новый
     */
    public String[] remove(String[] array){
        int dup = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length - dup; j++){
                if(array[i].equals(array[j])){
                    while(j != array.length - dup - 1
                            && array[array.length - dup - 1].equals(array[j])){
                        dup++;
                    }
                    String tmp = array[array.length - dup - 1];
                    array[array.length - dup - 1] = array[j];
                    array[j] = tmp;
                    dup++;
                }
            }
        }

        return Arrays.copyOf(array, array.length - dup);
    }
}
