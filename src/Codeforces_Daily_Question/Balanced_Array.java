package Codeforces_Daily_Question;

import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            if((n/2)%2==0){
                System.out.println("YES");
                int c=2,sum=0;
                for(int i=0;i<n/2;i++){
                    System.out.print(c+" ");
                    sum+=c;
                    c+=2;
                }
                c=1;
                for(int i=0;i<n/2-1;i++){
                    System.out.print(c+" ");
                    sum-=c;
                    c+=2;
                }
                System.out.println(sum+" ");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
