package inheritance;

public class Calc2 extends MyCalc1 {
    double d = 15.20;
    static String myStreetName = "Bowring Green";

    public void mathsOperations() {

        int e = 105;
        int f = 45;
        int g = 10;
        int t = e % g * f;
        System.out.println(t);
    }

    public static int division(int l, int m, int n) {
        int u = l / m;
        int v = u / n;
        return v;
    }

    public static void main(String[] args) {
        Calc2 objInheritance = new Calc2();

        objInheritance.add4Number(25,36,41,50); // from MyCalc1(parent class),non-static method
        System.out.println(objInheritance.myHouseNo); //non static variable
        Calc2.writeMyName("Wonderful"); //static method from PC
        System.out.println(Calc2.surname);  //static variable from PC

        //from current class
        System.out.println(objInheritance.d); //non-static variable
        objInheritance.mathsOperations();  // non-static method
        Calc2.division(200,10,5);  // static method
        System.out.println(Calc2.myStreetName);  //static variable

    }
}