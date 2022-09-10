package operators.forLoop;

public class DoWhileLoop {
    // number of iteration not known, and we have to execute the loop at least once
    //exit controlled loop since condition checked after once execution
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Printing the numbers;");
        do {
            System.out.println(i);
            i = i+1;
        }
        while (i>=10); //it will run once even the condition is false
    }

}
