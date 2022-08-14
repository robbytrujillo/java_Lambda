package programmer.zaman.now.lambda.app;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

    sayHello("Robby");

//    Bakal error
//    String name = null;
//    sayHello(name);

    }

    public static void sayHello(String name) {

        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

//        Optional<String> optionalName = Optional.ofNullable(name);
//
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//
//        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

          //if checkNull

//        if (name != null) {
//            String upperName = name.toUpperCase();
//            System.out.println("Hello " + upperName);
//        }

//        String nameUpper = name.toUpperCase();
//        System.out.println("Hello " + nameUpper);
    }
}
