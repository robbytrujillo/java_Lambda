package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
    //Method Reference Static
public class MethodReferenceApp {
    public static void main(String[] args) {

        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("robby"));
        System.out.println(predicateIsLowerCase.test("Robby"));

        //Method Reference di Parameter
        //Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Robby"));
    }

    //Method Reference Bukan Static
    public void run() {
        //MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("robby"));
        System.out.println(predicateIsLowerCase.test("Robby"));
    }
        //Method reference yang milik orang lain
        public void run2() {
            MethodReferenceApp app = new MethodReferenceApp();
            Predicate<String> predicateIsLowerCase = app::isLowerCase;

            System.out.println(predicateIsLowerCase.test("robby"));
            System.out.println(predicateIsLowerCase.test("Robby"));
        }

    public boolean isLowerCase(String value) {
        for(var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
