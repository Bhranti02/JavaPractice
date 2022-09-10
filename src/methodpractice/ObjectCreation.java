package methodpractice;

public class ObjectCreation {
    int x = 9;

    public  void add(){    //when method is not static, create object to call that method in main method
    int a =5;
    int b =7;
    int c =a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        //class name  obj name = new class name
        //object creation

        ObjectCreation obj1 = new ObjectCreation();
        obj1.add(); //to call the non-static method
        System.out.println(obj1.x); //to call non-static variable x by creating object
        int y = obj1.x;  //or declare another variable with object
        System.out.println(y);

    }
}
