package ru.job4j.heritage;

/**
 * Created by V.Verkhovykh on 02.11.2017.
 */
public class Engineer extends Profession {
    public void repair (Doctor doctor) {
        System.out.println(this.getName()+" repairs  Doctor "+doctor.getName()+" equipment");
    }
}
