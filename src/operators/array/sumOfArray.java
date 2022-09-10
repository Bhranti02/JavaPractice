package operators.array;

public class sumOfArray {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
                      //0 1 2 3 4
        int sum = 1;
        for (int i =0 ; i <number.length ; i++){
            sum = sum + number[i];    //for multiplication sum = sum * i
        }
        System.out.println(sum);
    }
}
