package operators.ifelse;

public class FindLeapYear {
    public static void checkleapYear(int year) {
        if ((year % 400 == 0) &&( year % 4 == 0 || year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        checkleapYear(2000);

    }

}