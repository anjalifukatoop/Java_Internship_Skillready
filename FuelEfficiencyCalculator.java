import java.util.Scanner;
public class FuelEfficiencyCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance =sc.nextDouble();
        double fuelUsed =sc.nextDouble();
        double FuelEfficiency = distance / fuelUsed;
        System.out.println("Fuel Efficiency ="+ FuelEfficiency +"km/l");

    }
}