import java.util.*;
public class For {
    public static void main(String[] args) {
        /* For ( Inicio ; Condicao ; Incremento) */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Declarando a quantidade de vezes que ele vai loopar
        int soma = 0;
        for (int i=0 ; i < N ; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);
        sc.close();
    }
}
