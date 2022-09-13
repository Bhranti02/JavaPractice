package inheritance;

public class MyCalc2 {

    double d = 15.20;
    static String myStreetName = "Bowring Green";

    public void mathsOperations(){

        int e = 105;
        int f = 45;
        int g =10;
        int t = e%g*f;
        System.out.println(t);

    }

    public static int division(int l, int m, int n){
        int u = l/m;
        int v = u/n;
        return v;
    }

    public static void main(String[] args) {
        System.out.println(division(100,10,10));
        System.out.println(myStreetName);
        MyCalc2 calc2 = new MyCalc2();
        System.out.println(calc2.d);
        calc2.mathsOperations();


        MyCalc1 obj2 = new MyCalc1();
        obj2.add4Number(2,3,5,7);
       int h = obj2.myHouseNo;
        System.out.println(h);

        String surname = MyCalc1.surname;
        System.out.println(surname);

        MyCalc1.writeMyName("Radhe");


    }


}
