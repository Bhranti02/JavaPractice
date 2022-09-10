package operators.forLoop;

public class TimeTables {

    public static void printTimeTable(int tableNumber){
        int result;

        System.out.println("My table for " +  tableNumber);
        System.out.println("-------");

        for(int i =1; i<=10; i++){
            result = tableNumber*1;
            System.out.println(tableNumber + "x" + i + "=" +  result); //to print 12x1=12
    }
        System.out.println("---------"); // if put inside for loop,it will print after each line
        }

    public static void main(String[] args) {

        printTimeTable(12);
    }
    }

