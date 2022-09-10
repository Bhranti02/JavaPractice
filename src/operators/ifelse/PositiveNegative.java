package operators.ifelse;

public class PositiveNegative {
    public static void findNumber(int number){
        if (number>0){
            System.out.println("POSITIVE");
        } else if (number<0) {
            System.out.println("NEGATIVE");
        }else{
            System.out.println("ZERO");
        }

    }

    public static void main(String[] args) {
        findNumber(12);
        findNumber(-13);
        findNumber(0);
    }



}
