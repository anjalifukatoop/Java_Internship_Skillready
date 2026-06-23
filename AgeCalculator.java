
import java.util.Scanner;

public class AgeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();
        int currentYear = sc.nextInt();
        int age = currentYear - birthYear;
        System.err.println("Age = "+ age);
        

    }
}