public class Demo013 {
    public static void main(String[] args) {
        double base = 4.0; 
        double height = 3.0; 
        double area = calculateArea(base, height);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}