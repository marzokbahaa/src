package lab3;

public class BankMethod {

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }

    public static double calculateCompoundInterest(double p, double r, int n) {
        return p * Math.pow(1 + r, n) - p;
    }

    public static String formatAmount(double amount, String currency) {
        return String.format("%.2f %s", amount, currency);
    }

    public static void main(String[] args) {

        double principal = 10000;
        double rate = 0.1;
        int years = 3;

        double simpleInterest = calculateSimpleInterest(principal, rate, years);
        double compoundInterest = calculateCompoundInterest(principal, rate, years);

        System.out.println("Simple Interest: " + formatAmount(simpleInterest, "EGP"));
        System.out.println("Compound Interest: " + formatAmount(compoundInterest, "EGP"));

        double totalSimple = principal + simpleInterest;
        double totalCompound = principal + compoundInterest;

        System.out.println("Total (Simple): " + formatAmount(totalSimple, "EGP"));
        System.out.println("Total (Compound): " + formatAmount(totalCompound, "EGP"));
    }
}