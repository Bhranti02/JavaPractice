package operators.forLoop;

public class additionOfRange {

    public static void addition(int from, int to) {
        int sum =1;
        for (int i = from; i <= to; i++) {
            sum = sum +i;

        }
        System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {

        addition(1,10);
    }
}


