package operators.logical;

public class AssignmentOpe02 {

    public static void main(String[] args) { //changing the value of x & y
        int x = 45;
        int y = 23;
        System.out.println(x);  //45
        System.out.println(y);  //23

        int z = x;  //45
        x = y;
        y = z;
        System.out.println(x); //23
        System.out.println(y); // 45

    }

}
