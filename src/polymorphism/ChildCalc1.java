package polymorphism;

public class ChildCalc1 extends ParentCalc1{

    public void myName(String a, String b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        ChildCalc1 obj1 = new ChildCalc1();
        obj1.myName("Pratik", "kumar"); // overriding parent class myName method,& execute child class myName method

     }

    }
