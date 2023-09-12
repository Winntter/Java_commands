import java.util.*;
public class BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BitWise são métodos de verificação bit a bit!"); // Usado em redes, arduino

        // 1 = True | 0 = False;
        int n1 = 89; // 0101 1001;
        int n2 = 60; // 0011 1100;

           // n1 & n2 = 0001 1000 / (24);
           // n1 | n2 = 0111 1101 / (125);
           // n1 ^ n2 = 0110 0101 / (101);

        System.out.println(n1 & n2); //Neste caso, ambos nûmeros precisam ser 1 (True) para a condição ser verdadeira.
        System.out.println(n1 | n2); // Basta que uma condição seja true para o resultado seja verdadeiro!
        System.out.println(n1 ^ n2); // Operação exclusiva quando ambos forem true a resposta será false.
        // Nesse caso ele pegara os numeros verdadeiros e convertera em bitwise!

        // Testando bit a bit

        int mask = 0b100000; // (32) apenas 6bit vale 1
        System.out.print("Insert number wants to verify: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit os false");
        }

        sc.close();

    }
}
