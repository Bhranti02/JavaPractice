package operators.array;

public class basicOfArray {
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,4,7,6,8,10,9}; // index start with 0=1,1=3,2=2,3=5....

        System.out.println(arr[1]);  //3
        System.out.println(arr[5]);  //7
       // System.out.println(arr[10]); //out of index/out of boundsException
        System.out.println(arr.length);  // to find the length of array

        for (int i = 0; i< arr.length;i++){  // array index start from 0,so i=0
            System.out.println(arr[i]);  // all number print till the length of array
        }
        //foreach - array
        for (int x : arr){  // we can use foreach instead of for loop to print all number till array length
            System.out.println(x);
        }

    }
}
