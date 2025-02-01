 class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class StudentDetails {
    public void display(String name) {
        System.out.println("Student Name: " + name);
    }
    public void display(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
    public void display(String name, int age, char grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class Demo054 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        StudentDetails studentDetails = new StudentDetails();
        System.out.println("Addition of two integers: " + mathOps.add(5, 10));
        System.out.println("Addition of three integers: " + mathOps.add(5, 10, 15));
        System.out.println("Addition of two double values: " + mathOps.add(5.5, 10.5));
        System.out.println("\nDisplaying Student Details:");
        studentDetails.display("pavan");
        studentDetails.display("maddy", 20);
        studentDetails.display("uday", 22, 'A');
    }
}