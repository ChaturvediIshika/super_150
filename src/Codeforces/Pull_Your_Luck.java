package Codeforces;

import java.util.Scanner;

public class Pull_Your_Luck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int x=sc.nextInt();
            x=n-x;
            int p=sc.nextInt();
            long q=((1+p)*p)/2;
            int d=n+x;
            int i=1;
            while(x>0 && i<=q){
                x-=i;
                i++;
            }
            i=1;
            while(d>0 && i<=q){
                d-=i;
                i++;
            }
            if(x==0 || d==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
