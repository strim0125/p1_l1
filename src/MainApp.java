public class MainApp {
    public static void main(String[] args) {
        fruts();
        checkSumSign(10, -130);
    }
    public static void fruts() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){
        int c = a + b;
        if (c < 0 ) {
            System.out.println("Отрицательная величина");}
        else {
            System.out.println("Положительная величина");
        };
    }

}
