package operators.switchCase;

public class DoWhile { // Exit control loop

    public static void main(String[] args) {
        int a = 10;
        do {
            System.out.println("Life");
            a--;
        }while (a>=11); // if you put wrong condition still it will run code once because , once it executes and
        // then check the condition for second execution
    }
}
