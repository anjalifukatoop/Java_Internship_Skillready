import java.util.Scanner;
public class CabFareCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int fare = distance * 15;
        System.out.println("Fare = Ru"+ fare);

    }
}