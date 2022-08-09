package programmer.zaman.now.lambda.app;

public class LazyApp {
    public static void main(String[] args) {

    testScore(60, "Robby");
    }

    public static void testScore(int score, String name) {
        if(score > 80) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Coba Lagi Tahun Depan");
        }
    }

    public static String getName(){
        System.out.println("Method getName dipanggil");
        return "Robby";
    }
}
