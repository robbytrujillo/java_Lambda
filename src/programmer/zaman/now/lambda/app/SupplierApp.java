package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

//        Supplier<String> supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "Robby Ilham Kususma";
//            }
//        };

        Supplier<String> supplier = () -> "Robby Ilham Kusuma";

        System.out.println(supplier.get());
    }
}
