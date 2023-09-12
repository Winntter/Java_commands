import java.util.*;
public class CondTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");
        double price = sc.nextDouble();
        double discount = (price < 35) ? price * 0.5 : price * 0.05; // Se o preço for menor que 35 ele executa a primeira,, caso contrario, o outro.
        double total = price - discount;

        System.out.println("O desconto sera de: " + discount + ", E o valor final será de: R$" + total);

        sc.close();
    }
}
