package operators.ifelse;

public class CompareNumbers {

    public static void compare (int a, int b, int c){
        if (a>b && a>c){
            System.out.println(a + " is a bigger number");
        }
        else if (b>a && b>c) {
            System.out.println(b +  " is a bigger number");
        }
        else {
            System.out.println(c  +" is a bigger number");
        }
    }

    public static void main(String[] args) {
        compare(12,15,18);
        compare(105,203,87);
        compare(501,874,963);
    }
}
