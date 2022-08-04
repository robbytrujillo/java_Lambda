package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

//        Predicate<String> predicateCheckBlank = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.isBlank();
//            }
//        };

        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Robby"));
    }


}
