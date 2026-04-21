package lab3;

public class StringUtils {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static String capitalise(String s) {
        if (isEmpty(s)) return s;

        char first = Character.toUpperCase(s.charAt(0));
        return first + s.substring(1);
    }

    public static String repeat(String s, int times) {
        String result = "";

        for (int i = 0; i < times; i++) {
            result += s;
        }

        return result;
    }

    public static int countChar(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println("Is Empty: " + isEmpty(""));

        System.out.println("Capitalise: " + capitalise("hello"));

        System.out.println("Repeat: " + repeat("Hi ", 3));

        System.out.println("Count 'a': " + countChar("banana", 'a'));
    }
}