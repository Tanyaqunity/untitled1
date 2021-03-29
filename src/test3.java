import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        double a = 2;
        double b = 8;
        double u = 4;

        int x = new Scanner(System.in).nextInt();
        System.out.println(x);
        double result;

        if (x < a) {
            result = Math.pow(x,4) * Math.sin(x);
        } else if (x >= a && x <= b) {
            result = x * Math.abs(x + u);
        } else {
            result = x - 1 + 1 / (x - 1.0);
        }
        System.out.println(result);

    }
}
