import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many test cases:");
        int n = scanner.nextInt();
        while(n-->0){
            System.out.println("enter the time:");
            int time = scanner.nextInt();
            if(time+3<=10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        scanner.close();
    
}
}