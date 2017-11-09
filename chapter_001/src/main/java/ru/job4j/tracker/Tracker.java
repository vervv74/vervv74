package ru.job4j.tracker;

/**
 * Created by v.verkhovykh on 09.11.2017.
 */
public class Tracker {
    static final Item[] items = new Item[100]; // объявляем массив объектов типа Item
    static int position = 0;
    /**
     * Method newItem
     *
     * @return id.
     */
    public Item newItem(int id, String name, String desc) {                    // метод генерации нового объекта типа Item
        Item item = new Item(id, name, desc);
        return item;

    }
    /**
     * Method add
     *
     * @param item
     */
    public void add(Item item) {       //метод добавления нового объекта в массив
        items[this.position] = newItem(this.position,"123", "1234" );
        this.position++;
    }

    /**
     * Method findByName
     *
     * @param id
     * @return qwe
     */
    public String findByID(int id) {       //метод поиска объекта в массиве
        String qwe = "null";
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                qwe = String.valueOf(item.getId());
                break;
            }
        }
        return qwe;
    }

    /**
     * Method Idelete
     *
     * @return id.
     */
    public void delete(int id) {
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                item.setId(0);
                break;
            }
        }
    }

    /**
     * Method update
     *
     * @param id * @param id1
     */
    public void update(int id, int id1) {
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                item.setId(id1);
                break;
            }
        }
    }
    /**
     * Method update
     *@return items[qwe].getId()
     * @param qwe
     */
    public  int findPozition(int qwe) {
        return items[qwe].getId();
    }
}
