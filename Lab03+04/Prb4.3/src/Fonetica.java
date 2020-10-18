import java.util.Scanner;

public class Fonetica {
    public static void main(String[] args) {
        String s = "Ana are pomiu";
        int vowels = numberVowels(s);
        int consonats = s.length() - vowels - isSpace(s);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonats: " + consonats);

        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        scan.close();
        giveHint(s, c);
    }

    public static int numberVowels(String s) {
        int v = 0;
        for(int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i)) {
                case 'a' -> v++;
                case 'A' -> v++;
                case 'e' -> v++;
                case 'E' -> v++;
                case 'i' -> v++;
                case 'I' -> v++;
                case 'o' -> v++;
                case 'O' -> v++;
                case 'u' -> v++;
                case 'U' -> v++;
            }

        }
        return v;
    }

    public static int isSpace(String s) {
        int v = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                v++;

        }
        return v;
    }

    public static void giveHint(String s, char c) {
        int v = 0;
        System.out.println("You may find character " + c + "in string s at position(s): ");
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
                System.out.println(i);

        }
    }


}