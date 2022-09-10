package strings;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        String myName ="Bhranti ";
        String lastName = "Patel";
        String c = myName   + lastName;


        System.out.println(myName.length()); // total character in name
        int l = myName.length();
        System.out.println(l);
        System.out.println(myName.charAt(3)); // index from 0,so B=0,h=1,r=2,a=3
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.concat(lastName));
        System.out.println(myName.compareTo(lastName));
        System.out.println(lastName.compareTo(myName));
        System.out.println(myName.compareToIgnoreCase(lastName));
        System.out.println(myName.contains(myName));
        System.out.println(lastName.contains(lastName));
        System.out.println(myName.contentEquals(lastName));
        System.out.println(c);
        System.out.println(myName.replace('a','r'));
        System.out.println(myName.replace("Bhranti", "Raina"));
        System.out.println(myName.replace("Bhranti", "Richa"));


    }
}
