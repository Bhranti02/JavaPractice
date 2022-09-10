package methodpractice;

public class Practice03 {
    public static void myName(String name, String surname){
        String x = name + surname;
        System.out.println(x);
    }

    public static String name(){
        String name = "Bhranti Patel";
        return name;

    }


    public static void main(String[] args) {
        myName("Bhranti  ", "Patel");
        System.out.println(name());

    }
}
