import java.util.Scanner;
public class BookReadingProgress{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totalPages = sc.nextInt();
        int pagesRead = sc.nextInt();
        int reamaindingPages = totalPages - pagesRead;
        System.out.println("ReamaindingPages ="+ reamaindingPages);
        

    }
}