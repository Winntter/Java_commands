import java.util.*;
public class DoWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;
        do {
            System.out.print("Type Celsius temperature: ");
                double C = sc.nextDouble();
                double F = ((9*C/5) + 32);
            System.out.println("The Fahrenheit temperature is: " + F);
            System.out.print("Keep converting? (s/n) ");
            resp = sc.next().charAt(0);
        } while (resp != 'n') ;

        sc.close();
    }
}
