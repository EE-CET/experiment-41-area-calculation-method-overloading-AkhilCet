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


        int r = input.nextInt();
        int l = input.nextInt();
        int w = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();

        System.out.printf("%.2f\n", AreaCalculator.calculateArea(r));
        System.out.printf("%.2f\n", AreaCalculator.calculateArea(l, w));
        System.out.printf("%.2f\n", AreaCalculator.calculateArea((double) b, (double) h));
        
        input.close();
    }
}
