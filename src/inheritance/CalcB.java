package inheritance;

public class CalcB extends CalcA{

    public void name(String myName){
        System.out.println("Bhranti");
    }

    public static void main(String[] args) {
        CalcB calcB = new CalcB();
        calcB.add(); // single level PC CalcA method

    }
}
