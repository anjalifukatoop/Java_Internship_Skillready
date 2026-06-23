
import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = units * 8;
        System.out.println("Bill =" +bill);

    }
}