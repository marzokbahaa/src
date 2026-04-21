package Lab1;

public class BankAccountVariables   {

    public static void main(String[] args) {
        String accountHolder = "Marzok Bahaa";
        long accountNumber = 202201106;
        double balance = 12000;
        boolean isActive = true;

        System.out.printf("=== Account Statement ===\n");
        System.out.printf("Account Holder : %s\n", accountHolder);
        System.out.printf("Account Number : %d\n", accountNumber);
        System.out.printf("Balance        : %.2f EGP\n", balance);
        System.out.printf("Account Active : %b\n", isActive);
    }
}