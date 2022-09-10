package operators.logical;

public class IncrementDecrement {


    public static void main(String[] args) {

        int x = 5;
        ++x; //increase first and then assign
        System.out.println(x); //6
        System.out.println(x++); //6 first print and then increase by 1(7), now x = 7
        System.out.println(x); //7
        System.out.println(++x);//8

        int y = 11;
        System.out.println(y); //11
        System.out.println(--y); //10, first decrease then print,now y =10
        System.out.println(y--); //10 first print,then decrease, now y=9
        System.out.println(y); //9

    }



}