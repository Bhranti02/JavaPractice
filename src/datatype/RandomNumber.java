package datatype;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
                                      // Random is a pre-defined class in java, create object for it
       int myRandomNumber = random.nextInt();//nextInt() is a method in random class,to generate random number every time
                                              // it will take one random integer and store in the object

        System.out.println(myRandomNumber);

        System.out.println(random.nextInt(100)); // it will generate number between 1-100 only

        System.out.println("bhranti.patel"+myRandomNumber+"@gmail.com");  //to print unique email id every time
          // String email = "bhranti.patel" + myRandomNumber +"@gmail.com";
        //sout(email);



    }
}
