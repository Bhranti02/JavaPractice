package operators.logical;

public class LogicalOp02 {
    public static boolean findLogic(int x, int y,int z){
        boolean ans = (x>=y &&  x<=z);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLogic(20,10,45));
    }
}
