package operators.ifelse;

public class LeapYear {

    public static void findLeapYear(int year) {
        // leap year divided by 4
        // it's not century
        //it is divided by 400
        if ((year %400 == 0 || year%100 != 0)&& year % 4==0) {
            System.out.println(year + " is a leap year");
        }
        else {

            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        findLeapYear(2000);
        findLeapYear(2024);
        findLeapYear(1800);
        findLeapYear(2020);
    }
}
