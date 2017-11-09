package ru.job4j.tracker;

/**
 * Created by v.verkhovykh on 09.11.2017.
 */
public class Item {
    static int count = 0;
    private String name;
    private String description;
    /**
     * Method setId.
     * @param id .
     */

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    /**
     * Method getId.
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * Method Item

     * @param name Your name.
     * @param description Your name.
     */
    public Item(int id, String name, String description) {
        this.id=id;
        this.name=name;
        this.description=description;
        count++;
    }
}
