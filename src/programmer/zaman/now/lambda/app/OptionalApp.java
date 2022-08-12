package programmer.zaman.now.lambda.app;

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

        Optional<String> optionalName = Optional.ofNullable(name);

        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

//        String nameUpper = name.toUpperCase();
//        System.out.println("Hello " + nameUpper);
    }
}
