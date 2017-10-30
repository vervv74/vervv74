package ru.job4j.control;

/**
 * Created by v.verkhovykh on 30.10.2017.
 */
public class ControlQwest {
    /**
     * @param str строка
     * @param str1 строка
     * @return boolean
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method check
     * @since 30.10.17 новый
     */
    public static boolean check(String str, String str1){
        boolean qwe=false;
        char[] strm = str.toCharArray();
        char[] strm1 = str1.toCharArray();
        for(int i=0; i<=strm.length-strm1.length; i++) {
            if (strm[i]==(strm1[0])) {
                qwe=true;
                for (int j=1; j<strm1.length; j++) {
                    if (strm[(i+j)]!=strm1[j]) {
                        qwe=false;
                    }
                }
            }
        }
        return qwe;
    }
}
