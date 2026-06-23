//Formula:- Annual Salary = Monthly Salary * 12
import java.util.Scanner;
public class EmployeeSalaryCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double annualSalary = salary * 12;
        System.out.println("Employee :"+ name);
        System.out.println("Annual Salary:"+ annualSalary);
    }
}

