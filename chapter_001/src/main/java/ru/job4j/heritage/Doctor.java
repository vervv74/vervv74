package ru.job4j.heritage;

/**
 * Created by V.Verkhovykh on 02.11.2017.
 */
public class Doctor extends Profession {
    public void treat() {
        System.out.println(this.getName()+" finished "+this.getEducation()+" to treat people");
    }
}
