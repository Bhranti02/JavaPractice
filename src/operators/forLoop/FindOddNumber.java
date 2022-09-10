package operators.forLoop;

public class FindOddNumber {

   public static void oddNumber(int from, int to) {
      for (int i = from; i <= to; i++) {
         if (i % 2 != 0) {
            System.out.println(i);
         }

      }

   }

   public static void main(String[] args) {
      oddNumber(1, 100);
      oddNumber(101,200);
   }
}
