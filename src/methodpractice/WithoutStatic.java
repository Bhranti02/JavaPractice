package methodpractice;

public class WithoutStatic {

    public int division(){
        int a =250;
        int b = 50;
        int c = a/b;

        return c;

    }
    public int addition(){
        int a =23;
        int b= 25;
        int c = a+b;
        return c;
    }


    public static void main(String[] args) {
        WithoutStatic divi1 = new WithoutStatic();
        divi1.addition();
        System.out.println(divi1.addition());
        divi1.division();
        System.out.println(divi1.division());

    }


}
