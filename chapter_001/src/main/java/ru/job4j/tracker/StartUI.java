package ru.job4j.tracker;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by v.verkhovykh on 24.11.2017.
 */
public class StartUI {
    private static final String ADD = "0";
    private static final String Show = "1";
    private static final String FindbyId = "2";
    private static final String FindbyName = "3";
    private static final String Exit = "4";
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
        System.out.println("Закрыть программу  - нажмите 4");
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (Exit.equals(answer)) {
                break;
            } else if (ADD.equals(answer)) {
                this.createItem();
            } else if (Show.equals(answer)) {
                try {
                    for (Item item : tracker.items) {
                        System.out.println("имя заявки - " + item.getName());
                    }
                } catch (NullPointerException e) {

                }
            } else if (FindbyId.equals(answer)) {
                try{
                int id = Integer.parseInt(this.input.ask("Введите id: "));
                if (tracker.findById(id) != null)
                {
                    System.out.println("Имя заявки: "+tracker.findById(id).getName());
                }} catch (NullPointerException e){}
            }
            else if (FindbyName.equals(answer)) {
                try{
                    String id = this.input.ask("Введите имя: ");
                    if (tracker.findByName(id)!=null)
                    {
                        System.out.println("Id заявки: "+tracker.findByName(id).getId());
                    } else {
                        System.out.println("нет такого имени");
                    }
                } catch (NullPointerException e){}
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой языки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    public static void main(String[] args) throws IOException {
        new StartUI(new ConsoleInput(), new Tracker()).init();

    }
}
