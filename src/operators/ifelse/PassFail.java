package operators.ifelse;

public class PassFail {

    public static void checkStudentPassOrFail(int marks) {

        if (marks >= 35 && marks <= 50) {
            System.out.println("student is pass" + marks);
        }
        else if (marks >= 51 && marks <= 65) {
            System.out.println("Student is pass with First class  " + marks);
        }
        else if (marks >= 66 && marks <= 75) {
            System.out.println("Student is pass with Distiction  " + marks);
        }
        else if (marks >= 76 && marks <= 100)
            System.out.println("student pass with Higher dis  " + marks);
        else
            System.out.println("student is Fail  "+marks);
        }

    public static void main(String[] args) {

        checkStudentPassOrFail(52);
        checkStudentPassOrFail(102); // also need to set max marks
    }
}
