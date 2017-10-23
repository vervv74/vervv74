package ru.job4j.condition;

/**
 * Created by v.verkhovykh on 23.10.2017.
 */
public class Point {
    /**
     * Created by v.verkhovykh on 23.10.2017.
     */
    private int x;
    /**
     * Created by v.verkhovykh on 23.10.2017.
     */
    private int y;
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method Point конструктор
     * @param x первое слагаемое
     * @param y второе слагаемое
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method getX геттер
     * @return x поле класса
    */
    public int getX() {
        return this.x;
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method getY геттер
     * @return y поле класса
     */
    public int getY() {
        return this.y;
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method is boolean
     * @return boolean
     * @param a первое слагаемое
     * @param b второе слагаемое
     */
    public boolean is(int a, int b) {
        return  getY() == a*getX()+b ? true : false; // используя оператор if проверить что точка (x, y) принадлежит функции y(x) = a * x + b;
    }
}
