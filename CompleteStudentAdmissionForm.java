import java.util.Scanner;
public class CompleteStudentAdmissionForm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        String fatherName = sc.nextLine();
        int age = sc.nextInt();
        double percentage = sc.nextDouble();
        sc.nextLine();
        String course = sc.nextLine();
        String mobile = sc.nextLine();
        String city = sc.nextLine();
        System.out.println("----------------");
        System.out.println("ADMISSION FORM");
        System.out.println("----------------");
        System.out.println("Student Name:"+ studentName);
        System.out.println("Father Name:"+fatherName);
        System.out.println("Age:"+age);
        System.out.println("Percentage:"+percentage);
        System.out.println("Course:"+course);
        System.out.println("Mobile:"+mobile);
        System.out.println("City:"+city);
        System.out.println("----------------");
        System.out.println("ADMISSION Successful");
        System.out.println("----------------");
    }
}