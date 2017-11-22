package ru.job4j.array;

/**
 * Created by v.verkhovykh on 22.11.2017.
 */
public class Sort {
    public int[] Plus(int[] qwe1, int[] qwe2){
        int qwe3[] = new int[qwe1.length + qwe2.length];
        int index = 0;
        int i = 0, j = 0;
        while (i < qwe1.length && j < qwe2.length) {
            if (qwe1[i] < qwe2[j]) { qwe3[index] = qwe1[i]; i++; }
            else { qwe3[index] = qwe2[j]; j++; } index++;
        }
        while (i < qwe1.length) { qwe3[index] = qwe1[i]; index++; i++; }
        while (j < qwe2.length) { qwe3[index] = qwe2[j]; index++; j++; }
      return qwe3;
    }
}

