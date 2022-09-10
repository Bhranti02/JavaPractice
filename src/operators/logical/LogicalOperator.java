package operators.logical;

public class LogicalOperator {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean a = x < y || x == 10;  //  || means OR, && means and
        boolean b = x < y && x == 20;
        boolean c = !(x < y || x >= y);
        boolean d = !(y > x && y == 10);

        System.out.println(x < y || x == 10); // create boolean or print direct
        System.out.println(a); // both are same

        System.out.println(x < y && x == 20);
        System.out.println(b);

        System.out.println(c);
        System.out.println(!(x < y || x >= y));

        System.out.println(d);
        //BODMAS- Bracket,Order, Division, Multiplication, Addition, Subtraction
        // (2+5)/20*(3+5)

    }


}
