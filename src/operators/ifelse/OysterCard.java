package operators.ifelse;

public class OysterCard {
    public static void checkOysterCardBalance(float Balance){
        float MINIMUM_BALANCE = 10.00f;

        if (Balance >= MINIMUM_BALANCE) {
            System.out.println("Gate will open");
        }
        else {
            System.out.println("please Top-up");
        }

    }

    public static void main(String[] args) {
        checkOysterCardBalance(4.23f);
        checkOysterCardBalance(10.25f);
        checkOysterCardBalance(-1.25f);
        checkOysterCardBalance(12.36f);

    }

}
