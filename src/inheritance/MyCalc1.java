package inheritance;

public class MyCalc1 {

    static String surname ="Patel";
    int myHouseNo = 38;

    public static void  writeMyName(String name) {
        System.out.println(name);

    }

    public void add4Number(int a, int b, int c, int d){
        int x = a+b+c+d;
        System.out.println(x);
    }

    public static void main(String[] args) {
        writeMyName("Bhranti");
        System.out.println(surname);

        MyCalc1 obj1 = new MyCalc1();
        obj1.add4Number(12,78,102,89);

        int houseNo = obj1.myHouseNo;
        System.out.println(houseNo);

    }
}
