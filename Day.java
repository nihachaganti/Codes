import java.util.*;
import java.io.*;
public class Day {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the test cases u want");
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int res  = n/6;
            if(n%6!=0){
                res++;
            }
            System.out.println(res*c);
        }
        sc.close();
        }

    }

