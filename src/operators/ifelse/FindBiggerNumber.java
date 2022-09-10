package operators.ifelse;

public class FindBiggerNumber{
    public static void main(String[] args) {
        int a = 101;
        int b = 501;
        int c = 145;

        if (a>b && a> c){     //condition comes with if only
            System.out.println("a is bigger" + a);
        }
        else {
            if (b>a && b>c){           //Nested if-else statement
                System.out.println("b is bigger " + b);
            }
            else {
                System.out.println("c is bigger " + c);
            }
        }


    }

}
