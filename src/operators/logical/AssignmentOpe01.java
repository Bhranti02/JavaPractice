package operators.logical;

public class AssignmentOpe01 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x); //5
        x = x+ 5; //10
        x+=5;  //15
        System.out.println(x); //15

        int y =8;
        System.out.println(y); //8
        y = y-3; //5
        y-=2;  //3
        System.out.println(y); //3

        int z = 9;
        System.out.println(z); //9
        z *=2; //18
        System.out.println(z); //18
        z/=3;
        System.out.println(z); //6
        z %= 5;
        System.out.println(z); //1


    }
}
