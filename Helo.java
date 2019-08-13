import java.util.Scanner;
public class Helo {
    public static void main(String[]args) {
        double g = 9.8;
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        double speed = g * t;
        double dist = 0.5 *g* t * t;
        System.out.println(speed);
        System.out.println(dist);
    }
}