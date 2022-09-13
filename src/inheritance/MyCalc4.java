package inheritance;

public class MyCalc4 {

    int x = 10;
    static int y = 5;

    public void add(){
        int z = x+y;
        System.out.println(z);
    }

    public static void sub(){
        int a = 8;
        int b = 20;
        int c = a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(y);
        sub();

        MyCalc4 calc4 = new MyCalc4();
        System.out.println(calc4.x);
        calc4.add();

        MyCalc1 obj4 = new MyCalc1();
        System.out.println(obj4.myHouseNo);
        obj4.add4Number(89,47,102,300);
        System.out.println(MyCalc1.surname);
        MyCalc1.writeMyName("Gokul");
    }

}
