package Codeforces_Daily_Question;

import java.util.Scanner;

public class GCDProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            if(n%2==0)
                System.out.println(n-3+" "+2+" "+1);
            else{
                int r=(n-1)/2;
                if(r%2==0){
                    System.out.println((r+1)+" "+(r-1)+" "+1);
                }
                else{
                    System.out.println(r+2+" "+(r-2)+" "+1);
                }
            }
        }
    }
}
