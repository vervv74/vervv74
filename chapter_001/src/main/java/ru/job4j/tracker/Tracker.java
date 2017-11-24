package ru.job4j.tracker;





import java.util.Random;



/**

 * Created by v.verkhovykh on 09.11.2017.

 */

public class Tracker {

    final Item[] items = new Item[100]; // объявляем массив объектов типа Item

    final Random random = new Random();

    private int position = 0;



    /**

     * Метод генерирует уникальный ключ для заявки.

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

            if (item.getId()==key) {

                return item;

            }

        }

        return null;

    }

}