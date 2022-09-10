package datatype;

public class FindSqRoot {

    public static void calculateSqRoot (double number){
       double x = Math.sqrt(number);
        System.out.println(x);

    }

    public static void main(String[] args) {
        calculateSqRoot(80);
        calculateSqRoot(16);
    }
}
