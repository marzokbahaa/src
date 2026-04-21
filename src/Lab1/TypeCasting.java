package Lab1;

public class TypeCasting {

    public static void main(String[] args) {

        double price = 29.99;
        int newPrice = (int) price;

        System.out.println("Original double: " + price);
        System.out.println("After casting to int: " + newPrice);

        System.out.println("7 / 2 = " + (7 / 2));

        System.out.println("(double)7 / 2 = " + ((double)7 / 2));

        String num = "42";
        int number = Integer.parseInt(num);

        System.out.println("Converted String to int: " + number);
    }
}