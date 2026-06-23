import java.util.Scanner;
public class StudentIntroduction{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Name:");
         String name = sc.nextLine();
         System.out.println("Enter Age:");
         int age = sc.nextInt();
         sc.nextLine();
         System.out.println("Enter City:");
         String city = sc.nextLine();
         System.out.println("\n----- STUDENT DETAILS -----");
         System.out.println("Name:"+ name);
         System.out.println("Age:"+ age);
         System.out.println("City:"+ city);
         sc.close();
    }

}