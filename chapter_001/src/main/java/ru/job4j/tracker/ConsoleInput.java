package ru.job4j.tracker;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by v.verkhovykh on 24.11.2017.
 */
public class ConsoleInput {
    Scanner scanner = new Scanner(System.in);

    public String ask(String quest) {
        System.out.println(quest);
        return scanner.next();
    }
}
