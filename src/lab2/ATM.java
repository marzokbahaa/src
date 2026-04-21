package lab2;

import java.util.Scanner;

public class ATM{
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        double balance =1000;
        while (true){
            System.out.println("ATM MENU");
            System.out.println("1- Check Balance");
            System.out.println ("2- Deposit");
            System.out.println ("3-withdraw");
            System.out.println ("4-Exait.Validate input ");

            int choice= input.nextInt();

            switch (choice)
            {
                case 1: System.out.println ("Your Balance ="+ balance );
                    break;
                case 2: System.out.println ("Enter Deposit Amount");
                    double deposit = input.nextDouble();
                    if(deposit>0)
                    {
                        balance +=deposit;
                        System.out.println("deposit successfully!");
                    }
                    else
                    {
                        System.out.println("Invalid amount! No negative deposits.");break;
                    }
                case 3:
                    System.out.println("Enter Withdraw Amount");
                    double withdraw = input.nextDouble();
                    if(withdraw>0 && withdraw<=balance)
                    {
                        withdraw -= balance ;
                        System.out.println("withdraw successfully");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance");
                    }
                    else
                    {
                        System.out.println("invalid amount");
                    }
                    break;

                case 4:
                    System.out.println("Thanks For Useing ATM");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");

            }

        }
    }
}