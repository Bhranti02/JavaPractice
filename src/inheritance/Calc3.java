package inheritance;

public class Calc3 extends MyCalc1{
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
        Calc3 objInheri01 = new Calc3();

        objInheri01.add4Number(78,102,48,89); //non-static method from parent class MyCalc1
        System.out.println(objInheri01.myHouseNo);  // non-static variable from PC
        Calc3.writeMyName("Ram");   // static method from PC
        System.out.println(Calc3.surname);

        //from current class
        Calc3.sumOfRange(10,20);  //static method
        System.out.println(Calc3.b);  //static variable
        objInheri01.modu(145,64);  //non-static method
        System.out.println(objInheri01.a);

    }
}
