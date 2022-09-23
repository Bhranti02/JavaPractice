package polymorphism;

public class PracticeOverloading {
     //overloading- same method name but different parameters
    // works on compile time-one class only
    public void multi(int a,int b){
        int x = a*b;
        System.out.println(x);

    }
    public void multi (int a,int b,int c){
        int y = a*b*c;
        System.out.println(y);

    }
    public void multi (int a,int b,int c,int d){
        System.out.println(a*b + c*d);

    }

    public static void main(String[] args) {
        PracticeOverloading obj = new PracticeOverloading();
        obj.multi(10,3,5,8);
        obj.multi(5,8);
    }
}
