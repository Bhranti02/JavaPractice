package operators.forLoop;
      // prime number is > 1, divided by only 1 and itself only
       //0 & 1 are not prime number,2 is the only even prime number because other even numbers can be divided by 2

public class FindPrimeNumber {
    public static void checkPrimeNumber(int number){
        int i = 0;
        int m = 0;
        int flag = 0;
        m = number/2;
        if (number==0 || number ==1){
            System.out.println(number + " is not a prime number");
        }
        else {
            for (i=2; i<=m; i++){
                if (number%i ==0){
                    System.out.println(number + " is not a prime number");
                    flag =1;
                    break;
                }
            }
        }if (flag==0){
            System.out.println(number + " is a prime number");
        }
        }


    public static void main(String[] args) {
        checkPrimeNumber(2);
        checkPrimeNumber(5);
        checkPrimeNumber(12);
        checkPrimeNumber(456);
        checkPrimeNumber(1237757);
    }
}
