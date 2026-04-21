package lab2;

public class DaySwitch {

    public static void main(String[] args) {

        for (int day = 1; day <= 8; day++) {

            String result = switch (day) {
                case 1 -> "Sunday";
                case 2 -> "Monday";
                case 3 -> "Tuesday";
                case 4 -> "Wednesday";
                case 5 -> "Thursday";
                case 6, 7 -> "Weekend";
                default -> "Invalid";
            };

            System.out.println("Day " + day + " -> " + result);
        }
    }
}