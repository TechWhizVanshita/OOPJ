import java.util.*;

class Test4 {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, (a + b));
        System.out.println(" ");

    }
}