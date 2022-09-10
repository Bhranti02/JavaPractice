package homework;

public class HomeWorkWithStatic {
    public static void myPracticeMethod() {
        int x = 15;
        int y = 10;
        int z = 25;
        int a = x*y/z;
        System.out.println(a);
    }

    public static void  myPractice(int a ,int b, int c){
        System.out.println(a+b+c);

    }
    public static int myMethodPractice(){
        int x = 89;
        int y = 78;
        int z = 27;
        int a = x*y*z;
        return a;
    }

    public static void main(String[] args) {
        myPracticeMethod();
        myPractice(12,11,13);
        System.out.println(myMethodPractice());






    }
}

