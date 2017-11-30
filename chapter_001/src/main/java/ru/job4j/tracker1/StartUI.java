package ru.job4j.tracker1;

/**
 * Created by v.verkhovykh on 30.11.2017.
 */
public class StartUI {
    private static final String ADD = "0";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    public void init() {
        boolean exit = false;
        while (!exit) {
            String answer = this.input.getAnswers()[0];
            if (EXIT.equals(answer)) {
                break;
            } else if (ADD.equals(answer)) {
                this.createItem();
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        Item item = new Item(input.getAnswers()[1], input.getAnswers()[2]);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
        for (Item item1 : tracker.items) {
            if (item1 != null) {
                System.out.println("имя заявки - " + item.getName());
                System.out.println("описание заявки - " + item.getDescription());
            }
        }
         String[] qwe = {input.getAnswers()[3],"","",""};
        input.setAnswers(qwe);
        System.out.println(input.getAnswers()[0]);
        System.out.println(tracker.findAll()[0].getName());

    }


    public static void main(String[] args) throws NullPointerException {
        Input input = new Input();
        new StartUI(input, new Tracker()).init();
    }
}
