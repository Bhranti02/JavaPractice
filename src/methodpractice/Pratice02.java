package methodpractice;

public class Pratice02 {
    public static void addition() {
        int a = 52;
        int b = 89;
        int c = 71;
        int d = a + b + c;
        System.out.println(d);
    }

    public static void addSub(int a, int b, int c) {
        int x = a + b - c;
        System.out.println(x);
    }

    public static void address(String houseNo, String streetName){
        String c = houseNo + streetName; //when declare another string variable to combine two parameter, do not use double quote""
        System.out.println(c);

    }

    public static void main(String[] args) {
        addition();
        addSub(50, 23, 14);
        addSub(123, 45,89);

        address("38" ,    "  Bowring Green");
        address("50  ", "Hesham Drive");


    }
}

