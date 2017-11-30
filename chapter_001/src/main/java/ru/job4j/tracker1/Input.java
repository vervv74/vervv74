package ru.job4j.tracker1;

/**
 * Created by v.verkhovykh on 30.11.2017.
 */
public class Input extends ConsoleInput {
    private String[] qwe = {"0","1","3","6"};

    public Input() {
        this.setAnswers(qwe);
    }
    public Input(String[] qwe) {
        this.qwe=qwe;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String[] getAnswers() {
        return answers;
    }

    private String[] answers=new String[4];
}
