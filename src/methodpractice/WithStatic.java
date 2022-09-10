package methodpractice;

public class WithStatic {

    public static void addNumbers() {
        int a = 10;
        int b = 12;
        int c = 7;
        int d = a + b + c;
        System.out.println(d);
    }

    public static int multiply() {
        int x = 5;
        int y = 5;
        int z = 4;
        int s = x * y * z;
        return s;
    }

    public static void addition(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);


    }

    public static void main(String[] args) {
        addNumbers();
        System.out.println(multiply());
        addition(96, 34, 78);
    }
}