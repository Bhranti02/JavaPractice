package methodpractice;

public class PraticeNonStaticMethod {

    int x = 35;
    int y= 78;
    int z = 15;
    int a = x+y+z;
public void add(){
    System.out.println(a);
    int s = 105;
    int t = 100;
    int u = s + t;
    System.out.println(u);

}

public float modulus(){
    float b = x%z;
    return b;

}
public void  multiplication(int a, int b){

}







    public static void main(String[] args) {
    PraticeNonStaticMethod obj1 = new PraticeNonStaticMethod();
        obj1.add();
        obj1.modulus();
        System.out.println(obj1.modulus());




    }
}
