import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            double s = (-b / 2 / a);
            System.out.println(s);
        } else if (d > 0) {
                System.out.print( ((-b + Math.sqrt(d)) / 2 / a));
                System.out.print(" ");
                System.out.println( ((-b - Math.sqrt(d)) / 2 / a));
            }
    }
}