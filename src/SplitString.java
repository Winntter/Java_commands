public class SplitString {
    public static void main(String[] args) {
        String s = "Potato Lemon Apple";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(s);
        System.out.println("Primeira palavra: " + word1);
        System.out.println("Segunda palavra: " + word2);
        System.out.println("Terceira palavra: " +word3);
    }
}
