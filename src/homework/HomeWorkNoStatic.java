package homework;

public class HomeWorkNoStatic {

    public void divison(){
        int a = 50;
        int b = 2000;
        int c = 10;
        int x = b/a/c;
        System.out.println(x);
    }

    public void addition(int a, int b, int c){

        int d = a+b+c;
        System.out.println(d);
    }

    public float multiplication(){
        float x =2.5f;
        float y = 7.8f;
        float z = x*y;
        return z;
    }


    public static void main(String[] args) {
        HomeWorkNoStatic divi1 = new HomeWorkNoStatic();
        divi1.divison();

        divi1.addition(85,36,75);

        System.out.println(divi1.multiplication());  //or
        float f = divi1.multiplication();
        System.out.println(f);
    }
}
