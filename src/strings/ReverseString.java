package strings;

public class ReverseString {
    public static void main(String[] args) {


        String myName = "Bhranti";
        String lastName = "Patel";

        StringBuffer stringBuffer = new StringBuffer(lastName);
        System.out.println(stringBuffer.reverse());   //or

        StringBuffer a = stringBuffer.reverse();
        System.out.println(a);



    }

}
