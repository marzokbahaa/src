package lab2;

public class TimesTable {

    public static void main(String[] args) {

        System.out.printf("%5s", "");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();

        System.out.println("====================================");

        for (int i = 1; i <= 5; i++) {

            System.out.printf("%5d", i);

            for (int j = 1; j <= 5; j++) {
                System.out.printf("%5d", i * j);
            }

            System.out.println();
        }
    }
}