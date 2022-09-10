package homework;

public class StaticWith3No {

    public static void add3No(int a,int b,int c){
        int d = a+b+c;
        System.out.println(d);
    }

    public static int multi3No(int x, int y,int z){
        int s = x*y*z;
        return s;
    }

    public static void multiDivi(int a,int b,int c){
        int x = a*b/c;
        System.out.println(x);

    }

    public static void main(String[] args) {
        add3No(12,14,20);
        System.out.println(multi3No(12,7,3));
        multiDivi(12,2,3);
    }
}
