package ru.job4j.tracker1;

import java.util.Random;

/**
 * Created by v.verkhovykh on 30.11.2017.
 */
public class Tracker {
    final Item[] items = new Item[100]; // объявляем массив объектов типа Item

    final Random random = new Random();

    private int position = 0;


    /**
     * Метод генерирует уникальный ключ для заявки.
     * <p>
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */

    private int generateId() {

        return random.nextInt();

    }


    /**
     * Method add
     *
     * @param item
     * @return item
     */

    public Item add(Item item) {       //метод добавления нового объекта в массив

        item.setId(this.generateId());

        items[position] = item;

        position++;

        return item;

    }


    /**
     * Method add
     *
     * @return item
     */

    public Item[] findAll() {

        return items;

    }


    public Item findByName(String key) {

        for (Item item : items) {

            if (item.getName().equals(key)) {

                return item;

            }

        }

        return null;

    }


    public Item findById(int key) {

        for (Item item : items) {
            if (item != null) {
                if (item.getId() == key) {

                    return item;

                }

            }
        }

        return null;

    }

    public void delete(int key) {

        for (Item item : items) {

            if (item != null) {

                if (item.getId() == key) {
                    item.setId(0);
                    item.setDescription("пустое");
                    item.setName("пустое");

                }
            }

        }
    }

    public void replace(int key, Item item) /*throws NullPointerException*/  {
        for (Item item1 : items) {
            try {
                if (item1.getId() == key) {
                    item1.setName(item.getName());
                    item1.setDescription(item.getDescription());
                }
            }
            catch(NullPointerException e){}

        }
    }

}
