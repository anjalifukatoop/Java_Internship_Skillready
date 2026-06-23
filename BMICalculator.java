import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);//formula
        System.out.printf("BMI = %.2f",bmi);

    }
}