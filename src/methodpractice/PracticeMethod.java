package methodpractice;

public class PracticeMethod {     //Last step after all method execution,use ctrl+a to refactor code, use ctrl+alt+l to refactor code
// inside the class if method or variable declare as static, then we can call it directly into main method without creating any object
    public static void addition() {
        int a = 5;//local variable, only available for this method
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    public static int multiplication() {      //first creat method with void, then if it's return type change it as per return type,here it's int so change void to int
        int a = 5;// local variable, so we can use again with different value
        int b = 8;
        int c = a * b;
        return c;
    }

    public static String printMyName() {     //start with void,return type is string so change void to string
        String myName = "Bhranti";
        return myName;
    }

    public static boolean answerType() {         //start method with void then change it to boolean
        boolean b = true;
        return b;
    }


    public static void main(String[] args) {
        addition();// this is a void method ,so we can call directly
        System.out.println(multiplication()); // due to return type ,can not run directly, so need to use sout to execute the multiplication
        //or declare another variable int d = multiplication() //name of method,small bracket is means method
        int d = multiplication();
        System.out.println(d);
        System.out.println(printMyName());  //or declare another variable String x=printMyName(),String as per method type
        String x = printMyName();
        System.out.println(x);
        System.out.println(answerType());  //print direct metod
        boolean y = answerType();       //or declare another boolean variable y and print
        System.out.println(y);

    }
}
