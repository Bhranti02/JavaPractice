package operators.logical;

public class PraticeIncreDecre {

    public static int myMethod(int a) {
        int c = a++;
        return c;

    }

    public static int myNo(int b) {
        int d = ++b;

        return d;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(32));
        System.out.println(myNo(10));
    }
}