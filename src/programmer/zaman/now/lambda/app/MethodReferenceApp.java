package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

        System.out.println(predicateIsLowerCase.test("Robby"));
        System.out.println(predicateIsLowerCase.test("Robby"));
    }
}
