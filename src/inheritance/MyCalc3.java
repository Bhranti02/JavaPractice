package inheritance;

public class MyCalc3 {
    char a = '£';
    static float b = 1.52f;

    public void modu(float x,float y){
        float z = x%y;
        System.out.println(z);
    }
    public static void sumOfRange(int from,int to){
       int sum = 1;
       for (int i = from; i<=to ; i++){
           sum = sum +i;
       }
        System.out.println("Sum between two numbers " + from +"-" +to +" is "+sum );
    }

    public static void main(String[] args) {
        sumOfRange(2,7);
        System.out.println(b);

        MyCalc3 calc3 = new MyCalc3();
        calc3.modu(25,4);
        System.out.println(calc3.a);

        MyCalc1 obj3 = new MyCalc1();
        System.out.println(obj3.myHouseNo);
        obj3.add4Number(36,789,45,12);

        System.out.println(MyCalc1.surname);
        MyCalc1.writeMyName("Krishna");


    }
}
