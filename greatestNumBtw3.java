import java.util.*;

class Test6 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner vs = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = vs.nextInt();

        System.out.print("Enter b: ");
        b = vs.nextInt();

        System.out.print("Enter c: ");
        c = vs.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is max", a);
            System.out.println(" ");
        }

        else if (b > a && b > c) {
            System.out.printf("%d is max", b);
            System.out.println(" ");
        }

        else {
            System.out.printf("%d is max", c);
            System.out.println(" ");

        }

    }
}