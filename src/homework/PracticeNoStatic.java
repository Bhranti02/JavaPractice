package homework;

public class PracticeNoStatic {

    public void add(){
        int x = 123;
        int y = 456;
        int z = 783;
        int v = x+y+z;
        System.out.println(v);
    }

    public void multi(int a, int b, int c){
        int d = a*b*c;
        System.out.println(d);
    }

    public double divi(){
        double s = 45.23f;
        double t =789.63f;
        double u = 1234.56f;
        double z = u/t/s;
        return z;

    }

    public static void main(String[] args) {
        PracticeNoStatic add1 = new PracticeNoStatic();
        add1.add();

        add1.multi(74,52,31);

        System.out.println(add1.divi());
        double x = add1.divi();
        System.out.println(x);
    }
}
