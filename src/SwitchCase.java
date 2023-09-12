import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");

        System.out.print("Insert the number: ");
        int x = sc.nextInt();
        String day = switch (x) {
            case 1 -> "Sunday.";
            case 2 -> "Monday.";
            case 3 -> "Tuesday.";
            case 4 -> "Wednesday.";
            case 5 -> "Thursday.";
            case 6 -> "Friday.";
            case 7 -> "Saturday.";
            default -> "Not found.";
        };

        System.out.println(day);


        sc.close();
    }
}
