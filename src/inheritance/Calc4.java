package inheritance;

public class Calc4 extends MyCalc1{
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
        Calc4 objInher02 = new Calc4();

        System.out.println(objInher02.myHouseNo); //from PC MyCalc1
        objInher02.add4Number(201,405,605,879);
        System.out.println(Calc4.surname);
        Calc4.writeMyName("Sita");

        //from current class
        System.out.println(Calc4.y);
        Calc4.sub();
        System.out.println(objInher02.x);
        objInher02.add();

    }
}
