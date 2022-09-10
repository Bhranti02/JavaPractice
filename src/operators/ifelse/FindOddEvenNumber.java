package operators.ifelse;

public class FindOddEvenNumber {

    public static void oddEven(int a){
        int b = a%2;
        if (a>0 && b==0 ){
            System.out.println(a  +" is even number");
        }
        else {
            System.out.println(a  +" is odd number");
        }
    }

    public static void main(String[] args) {
        oddEven(25);
        oddEven(60);
        oddEven(1456987);
        oddEven(0);
        oddEven(-24);
    }
}
