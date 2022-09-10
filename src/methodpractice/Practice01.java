package methodpractice;

public class Practice01 {
    public void add() {
        int a = 145;
        int b = 123;
        int c = a + b;
        System.out.println(c); //for void method ,to call it give sout in method
    }

    public float multi() {
        float x = 10.25f;
        float y = 20.20f;
        float z = x * y;
        return z;

    }

    public int divi(int s, int t, int u) {
        int v = s / t;
        int i = u * v;
        return i;     //or return u*v

    }

    public static void main(String[] args) {
        Practice01 obj1 = new Practice01();
        obj1.add(); //direct method call will print result because sout is already given in UD void method,can not declare another variable for void method

        obj1.multi();   //create object for return type method
        System.out.println(obj1.multi());  //to print result of return type method
        float d = obj1.multi();    // create variable  for the whole obj1 for return type method
        System.out.println(d);  // it will print same result for return type method

        System.out.println(obj1.divi(250, 50, 10)); //return type method with parameter
        int r = obj1.divi(500, 100, 20);
        System.out.println(r);


    }
}
