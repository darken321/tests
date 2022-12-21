import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            int s = (-b / 2 / a);
            System.out.println(s);
        } else // тут можно убрать d>0 в этой ветке всегда d>0
            if (d > 0) {
                System.out.print((int) ((-b + Math.sqrt(d)) / 2 / a));
                System.out.print(" ");
                System.out.println((int) ((-b - Math.sqrt(d)) / 2 / a));
            }
    }
}