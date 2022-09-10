package operators.switchCase;

public class MonthNumbers {

    public static void numberOfMonths(char number){  // if String then use double quote and full month name
        switch (number){
            case 'j':
                System.out.println(1);
                break;
            case 'f':
                System.out.println(2);
                break;
            case 'm':
                System.out.println(3);
                break;
                case 'a':
                    System.out.println(4);
                    break;
            case 'M':
                System.out.println(5);
                break;
            case 'J':
                System.out.println(6);
                break;
            case 'u':
                System.out.println(7);
                break;
            case 'A':
                System.out.println(8);
                break;
            case 's':
                System.out.println(9);
                break;
            case 'o':
                System.out.println(10);
                break;
            case 'n':
                System.out.println(11);
                break;
            case 'd':
                System.out.println(12);
                break;
            default:
                System.out.println("invalid month name");

        }
    }

    public static void main(String[] args) {
        numberOfMonths('j');
        numberOfMonths('J');
        numberOfMonths('a');
    }
}
