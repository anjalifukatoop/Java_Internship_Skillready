import java.util.Scanner;
public class ATMWithdrawal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdraw = sc.nextInt();
        int remaining = balance - withdraw;
        System.out.println("Remaining Balance = "+ remaining);

    }
}