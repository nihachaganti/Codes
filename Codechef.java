import java.util.*;

public class Codechef
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of test cases u want:");
        int T = sc.nextInt(); // Read the number of test cases
        while (T-- > 0) {
            System.out.println("Enter three integer values (a, b, c): ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // Correct average calculation
            double temp = (a + b) / 2.0;
            
            // Correct condition check
            if (temp > c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close(); // Close the scanner
    }
}
