package Codeforces_Daily_Question;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n<=2)
                System.out.println(1);
            else {
                int floor=2;
                int m=x;
                while (n>m+2){
                    floor++;
                    m+=x;
                }
                System.out.println(floor);
            }
        }
    }
}
