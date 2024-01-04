import java.lang.Math;
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cordinates of which youw want to calculate the distance");
        System.out.print("x1:");
        double x1 = scanner.nextDouble();
        System.out.print("x2:");
        double x2 = scanner.nextDouble();
        System.out.print("y1:");
        double y1= scanner.nextDouble();
        System.out.print("y2:");
        double y2 = scanner.nextDouble();
        double delta = x2 - x1;
        double delta2 = y2 - y1;
        double calculate = Math.sqrt(delta * delta + delta2 * delta2);
        System.out.println(calculate);

    }
}
