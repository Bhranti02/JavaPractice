package methodpractice;

public class VoidMethod {

    int x = 5;
    public void add() {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    public static int multi() {
        int a = 5;
        int b = 8;
        int c = a * b;
        return c;
    }

    public static String printMyName() {
        String myName = "Bhranti";
        return myName;
    }

    public static boolean answerType() {
        boolean b = true;
        return b;
    }

    public static void printHouseName(String myHouseName){
        System.out.println(myHouseName);

    }

    public static void addTwoNumber(int a, int b){
        int c = a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        //Object creation
        VoidMethod obj1 = new VoidMethod();
        obj1.add();
        System.out.println(obj1.x);

       //        int d = multi();
//        System.out.println(multi());
//        System.out.println(d);
//        System.out.println(printMyName());
//        System.out.println(answerType());
//        printHouseName("Shreedham");
        addTwoNumber(500, 600);
        addTwoNumber(896, 458);

          }
}

