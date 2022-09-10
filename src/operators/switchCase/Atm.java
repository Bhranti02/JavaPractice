package operators.switchCase;

public class Atm {
    public static void myAccountinfo(int choices){
        switch (choices){
            case 1:
                System.out.println("check my balance");
                break;
            case 2:
                System.out.println("cash withdrawal");
                break;
            case 3:
                System.out.println("cash deposit");
                break;
            case 4:
                System.out.println("cheque deposit");
                break;
            case 5:
                System.out.println("change PIN number"); // no break meand will print case 5 and default case
            default:
                System.out.println("insufficient fund");
        }
    }

    public static void main(String[] args) {
        myAccountinfo(5);
        myAccountinfo(7);
        myAccountinfo(2);
        myAccountinfo(4);
    }
}
