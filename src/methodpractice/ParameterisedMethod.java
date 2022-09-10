package methodpractice;

public class ParameterisedMethod {
    public static void printHouseName(String myHouseName){     //inside small bracket declare parameter
        System.out.println(myHouseName); //we already sout method parameter,so we can call it directly into main method
        // to print any (parameter) house name
    }

    public static void main(String[] args) {
        printHouseName("Shreedham");  //you can give any house name as a parameter and it will print it
        printHouseName("Gokuldham");
        printHouseName("Aravalli"); //use "" to print String variable
    }
}
