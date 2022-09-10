package operators.switchCase;

public class resturantMenu {

    public static void menuItems(int dishName){
        switch (dishName){
            case 1:
                System.out.println("Paneer Tikka");
                break;
            case 2:
                System.out.println("Biryani");
                break;
            case 3:
                System.out.println("Naan");
                break;
            case 4:
                System.out.println("Dal Tadka");
                break;
            case 5:
                System.out.println("Drinks");
            default:
                System.out.println("Not available");
        }
    }

    public static void main(String[] args) {
        menuItems(3);
        menuItems(4);
        menuItems(6);
    }
}
