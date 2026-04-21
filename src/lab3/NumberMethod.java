package lab3;

public class NumberMethod {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        int num = 121;

        System.out.println("Is Prime (7): " + isPrime(7));
        System.out.println("Is Prime (10): " + isPrime(10));

        System.out.println("Reverse (1234): " + reverseNumber(1234));

        System.out.println("Is Palindrome (121): " + isPalindrome(121));
        System.out.println("Is Palindrome (123): " + isPalindrome(123));

        System.out.println("Sum Digits (1234): " + sumDigits(1234));
    }
}