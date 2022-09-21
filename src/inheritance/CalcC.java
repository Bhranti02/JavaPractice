package inheritance;

public class CalcC extends CalcA {

    public static void main(String[] args) {
       CalcC calcC = new CalcC();
       // CalcC extends CalcB
       // calcC.name("Hello"); // multi level PC CalcB method
       // calcC.add(); // multi level GP CalcA method

        // Hierarchical
        calcC.add(); //PC CalcA method



    }



}
