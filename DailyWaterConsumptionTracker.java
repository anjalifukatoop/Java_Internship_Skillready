import java.util.Scanner;
public class DailyWaterConsumptionTracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double morning = sc.nextDouble();
        double afternoon = sc.nextDouble();
        double evening = sc.nextDouble();
        double total = morning + afternoon + evening;
        System.err.println("Total Water Consumed = "+ total +"Liters");

    }
}