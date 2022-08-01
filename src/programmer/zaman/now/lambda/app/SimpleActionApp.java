package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        //versi Anonimus Class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Robby";
            }
        };

        System.out.println(simpleAction1.action());

        //versi sederhana Java Lambda
        SimpleAction simpleAction2 = () -> {
            return "Robby";
        };

        System.out.println(simpleAction2.action());

    }
}
