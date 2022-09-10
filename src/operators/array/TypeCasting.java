package operators.array;

public class TypeCasting {
    public static void main(String[] args) {
        // wide casting
        int myInt = 9;
        System.out.println(myInt);
        double myDouble = myInt; //Automatic casting: int to double, small to larger memory
        System.out.println(myDouble);  // same output 9.0 in double

        //narrow casting
        double myDouble1 = 7.83d;
        System.out.println(myDouble1);

        byte myByte1 = (byte) myDouble1; //Manual casting: double to byte. large to smaller memory
        System.out.println(myByte1);  // from double 7.83 to byte 7 output

        int myInt1 = (int) myDouble1; // small variable type = (small variable type) larger type
        System.out.println(myInt1);
    }


}
