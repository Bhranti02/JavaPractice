package operators.forLoop;

public class ForEach {
    public static void main(String[] args) {
        String names []  = {"Java", "c","c++","Python", "JavaScript"};
        System.out.println("Printing the content of the array names:");
        for (String name:names)
        {
            System.out.println(name);

        }
    }
}
