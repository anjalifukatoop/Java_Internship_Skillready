
import java.util.Scanner;
public class PizzaBillGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int price = 199;
        int totalBill = quantity * price;
        System.out.println("Total Bill = Ru."+ totalBill);
        
    }
}