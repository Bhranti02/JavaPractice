package operators.switchCase;

public class WeekDaysNumber {

    public static void dayNumber(String day){
        switch (day){
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursady":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("invalid day name");

        }
    }

    public static void main(String[] args) {
        dayNumber("Monday");  // it has same as switch case name, no upper/lower case accepted
        dayNumber("monday");
        dayNumber("Saturaday");
        dayNumber("Saturday");
    }
}
