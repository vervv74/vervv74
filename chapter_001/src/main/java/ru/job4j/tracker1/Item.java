package ru.job4j.tracker1;

/**
 * Created by v.verkhovykh on 30.11.2017.
 */
public class Item {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private String description;
    private int id;
    /**
     * Method getName.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
    /**
     * Method setId.
     *
     * @param id .
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method getId.
     *
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * Method Item
     *
     * @param name        Your name.
     * @param description Your name.
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;

    }
}
