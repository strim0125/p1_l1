public class MainApp {
    public static void main(String[] args) {
        fruts();
        checkSumSign(10, -130);
        printColor(80);
        compareNumbers(10, 230);
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

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 || value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        };
    }

        public static void compareNumbers(int a, int b){
            if( a >= b ){
                System.out.println(" a >= b");
            } else {
                System.out.println(" a < b");
            }
        };
}
