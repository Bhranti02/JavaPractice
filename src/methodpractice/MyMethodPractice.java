package methodpractice;

public class MyMethodPractice {

    static int a = 5;

    public static String printMyName(){
       String myName = "Bhranti";
       return myName;
    }

    public static void main(String[] args) {
        System.out.println(printMyName()); //calling the UD method into main method
        //if non-static create object and call it
        System.out.println(a); //int a is static so we can call directly
    }
}
