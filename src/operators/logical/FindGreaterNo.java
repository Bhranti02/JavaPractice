package operators.logical;

public class FindGreaterNo {

    public static boolean myMethod(int x , int y){
    return x > y;

    }
    public static boolean lowerNo(int a, int b){
        boolean c = a<b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(4,5));
        System.out.println(myMethod(15,10));

        System.out.println(lowerNo(25,36));
    }
}
