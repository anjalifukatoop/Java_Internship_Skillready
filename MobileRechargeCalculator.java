import java.util.Scanner;
public class MobileRechargeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double gst = amount * 18 / 100;
        double finalAmount = amount + gst;//Formula
        System.out.println("Final Amount = "+ finalAmount);

    }
}