package polymorphism;

public class ParentCalc1 {

    public void myName(String a, String b){
        System.out.println(a + "  " + b);
    }

    public static void main(String[] args) {
        ParentCalc1 obj1 = new ParentCalc1();

        obj1.myName("Bhranti", "Patel");

    }

}
