//Formula:- Strike Rate = (Runs * 100)/Balls
import java.util.Scanner;
public class CricketStrikeRateCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double runs = sc.nextDouble();
        double balls = sc.nextDouble();
        double strikeRate = (runs / balls)*100;
        System.out.println("Strike Rate = "+ strikeRate);

        
    }
}