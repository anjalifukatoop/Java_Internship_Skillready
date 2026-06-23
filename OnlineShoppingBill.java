import java.util.Scanner;
public class OnlineShoppingBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        int totalAmount = price * quantity;
        System.out.println("Total Amount = " + totalAmount );

    }
}