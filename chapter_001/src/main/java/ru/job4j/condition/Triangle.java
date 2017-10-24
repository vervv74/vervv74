package ru.job4j.condition;

/**
 * Created by v.verkhovykh on 23.10.2017.
 */
public class Triangle {
    /**
     * Created by v.verkhovykh on 23.10.2017.
     */
    private Point a;
    /**
     * Created by v.verkhovykh on 23.10.2017.
     */
    private Point b;
    /**
     * Created by v.verkhovykh on 23.10.2017.
     */
    private Point c;
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method Triangle конструктор
     * @param a точка
     * @param b точка
     * @param c точка
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method distance расстояние
     * @return distance
     * @param left первая точка
     * @param right вторая точка
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow( (left.getX()-right.getX()), 2)+Math.pow( (left.getY()-right.getY()), 2));
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method period периметр
     * @return расстояние
     * @param ab первая сторона
     * @param ac вторая сторона
     * @param bc третья сторона
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc)/2;
}
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method area площадь
     * @return площадь
     */
    public double area(){
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
    /**
     * Created by v.verkhovykh on 23.10.2017.
     * Method exist true
     * @return true
     * @param a первая сторона
     * @param c вторая сторона
     * @param b третья сторона
     */
    private boolean exist(double a, double c, double b) {
        return (a+b) > c && (a+c) > b && (b+c) > a ? true : false;
    }
}
