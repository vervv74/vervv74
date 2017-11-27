package ru.job4j.tracker;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by v.verkhovykh on 24.11.2017.
 */
public class StartUI {
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String FINDBYID = "2";
    private static final String FINDBYNAME = "3";
    private static final String DELETE = "4";
    private static final String REPLACE = "5";
    private static final String EXIT = "6";
    private final ConsoleInput input;
    private final Tracker tracker;

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("Добавить заявку  - нажмите 0");
        System.out.println("Показать все заявки  - нажмите 1");
        System.out.println("Найти заявку по id  - нажмите 2");
        System.out.println("Найти заявку по имени  - нажмите 3");
        System.out.println("Обнулить заявку  - нажмите 4");
        System.out.println("Заменить заявку  - нажмите 5");
        System.out.println("Закрыть программу  - нажмите 6");
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (EXIT.equals(answer)) {
                break;
            } else if (ADD.equals(answer)) {
                this.createItem();
            } else if (REPLACE.equals(answer)) {
                this.replace();
            } else if (SHOW.equals(answer)) {
                this.show();
            } else if (FINDBYID.equals(answer)) {
                this.findbyid();
            } else if (FINDBYNAME.equals(answer)) {
                this.findbyname();
            } else if (DELETE.equals(answer)) {
                this.delete();
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    public void delete() {
        int id = Integer.parseInt(this.input.ask("Введите id:"));
        for (Item item : tracker.items) {
            if (item != null)
                if (tracker.findById(id) != null) {
                    tracker.delete(id);
                }
        }
    }

    public void replace() throws NullPointerException {
        int id = Integer.parseInt(this.input.ask("Введите id заменяемого объекта"));
            if (tracker.findById(id) != null)
                 {
                    System.out.println("------------ Добавление новой заявки взамен старой --------------");
                    String name = this.input.ask("Введите имя заявки :");
                    String desc = this.input.ask("Введите описание заявки :");
                    Item item2 = new Item(name, desc);
                    tracker.replace(id, item2);
                }

    }

    public void show() {
        for (Item item : tracker.items) {
            if (item != null)
                System.out.println("имя заявки - " + item.getName());
        }
    }

    public void findbyid() {
        int id = Integer.parseInt(this.input.ask("Введите id: "));
        for (Item item : tracker.items) {
            if (item != null)
                if (tracker.findById(id) != null) {
                    System.out.println("Имя заявки: " + tracker.findById(id).getName());
                }
        }
    }

    public void findbyname() {
        String id = this.input.ask("Введите имя: ");
        for (Item item : tracker.items) {
            if (item != null)
                if (tracker.findByName(id) != null) {
                    System.out.println("Id заявки: " + tracker.findByName(id).getId());
                }
        }
    }

    public static void main(String[] args) throws NullPointerException {
        new StartUI(new ConsoleInput(), new Tracker()).init();

    }
}
