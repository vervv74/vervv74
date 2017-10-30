package ru.job4j.control;

/**
 * Created by v.verkhovykh on 30.10.2017.
 */
public class ControlQwest {
    /**
     * @param str  строка
     * @param str1 строка
     * @return boolean
     * @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
     * Method check
     * @since 30.10.17 новый
     */
    public static boolean check(String str, String str1) {
        boolean qwe = false;
        char[] strm = str.toCharArray();
        String[] strms = new String[strm.length];
        for (int i = 0; i < strm.length; i++) {
            strms[i] = String.valueOf(strm[i]);
        }
        char[] strm1 = str1.toCharArray();
        String[] strmls = new String[strm1.length];
        for (int i = 0; i < strm1.length; i++) {
            strmls[i] = String.valueOf(strm1[i]);
        }
        for (int i = 0; i <= strms.length - strmls.length; i++) {
            if (strms[i].equals((strmls[0]))) {
                qwe = true;
                for (int j = 1; j < strmls.length; j++) {
                    if (!strms[(i + j)].equals(strmls[j])) {
                        qwe = false;
                    }
                }
            }
        }
        return qwe;
    }
}
