package ru.job4j.calculator;
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
public class Calculator {
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* @since 20.10.17
*/
    private double result;
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* Method add
* @param first первое слагаемое
* @param second второе слагаемое
* @since 20.10.17
*/
    public void add(double first, double second) {
        this.result = first + second;
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* Method substract
* @param first уменьшаемое
* @param second вычитаемое
* @since 20.10.17
*/
	public void substract(double first, double second) {
        this.result = first - second;
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* Method div
* @param first числитель
* @param second знаменатель
* @since 20.10.17
*/
	public void div(double first, double second) {
        this.result = first / second;
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* Method multiple
* @param first числитель
* @param second знаменатель
* @since 20.10.17
*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }
/**
* @author Valentin Verkhovykh (mailto:vervv74@gmail.com)
* Method getResult
* @since 20.10.17
* @return getResult результат вычислений
*/
    public double getResult() {
        return this.result;
    }
}
