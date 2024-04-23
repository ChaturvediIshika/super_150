package Codeforces_Daily_Question;

import java.util.Scanner;

public class PreparingfortheContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            if(k==0){
                for(int i=n;i>0;i--)
                    System.out.print(i+" ");
            }
            else {
                System.out.print(1+" ");
                for (int i=n-k+1;i<=n;i++)
                    System.out.print(i+" ");
                for (int i=n-k;i>1;i--)
                    System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
