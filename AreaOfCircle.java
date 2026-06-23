import java.util.Scanner;
//Formula:- Area = 3.14 * radius * radius
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area "+ area);
        
    }
}