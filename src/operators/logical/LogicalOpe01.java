package operators.logical;

public class LogicalOpe01 {
    public static boolean twoNumbers(int a, int b) {

        boolean flag = (a >= b && a < b);
        return flag;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(twoNumbers(x, y));
        System.out.println(twoNumbers(35, 15));
    }
}
