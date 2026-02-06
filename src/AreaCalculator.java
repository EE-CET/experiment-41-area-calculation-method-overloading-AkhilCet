import java.util.Scanner;

public class AreaCalculator {
    
   public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(float length, float width) {
        return length * width;
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;  
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


        float r = input.nextFloat();
        float l = input.nextFloat();
        float w = input.nextFloat();
        double b = input.nextDouble();
        double h = input.nextDouble();

        System.out.printf("%.2f\n", AreaCalculator.calculateArea(r));
        System.out.printf("%.2f\n", AreaCalculator.calculateArea(l, w));
        // Java does not support keyword arguments. The line above will not compile.
        // To call the specific method for the triangle's area, you can cast the
        // integer variables to doubles to match the method signature.
        System.out.printf("%.2f\n", AreaCalculator.calculateArea( b, h));
        
        input.close();
    }
}
