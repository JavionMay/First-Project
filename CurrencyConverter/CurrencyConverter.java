import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        userInterface();
    }
    public static void userInterface() {
        Scanner in = new Scanner(System.in);
        System.out.println("What Currency Are You Converting To?");
        char Currency = in.next().charAt(0);
        System.out.println("What Is Your Current Currency?");
        char Current = in.next().charAt(0);
        in.close();
    }
    public static int conversion(char currency, char current) {
        if (currency == )
    }
}