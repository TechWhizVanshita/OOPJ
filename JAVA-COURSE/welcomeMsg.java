import java.util.*;

class welcomeMsg{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=s.nextLine();

        System.out.println("Welcome "+name);
    }
}