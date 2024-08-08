package Codeforces_Daily_Question;

import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m= sc.nextInt();
            boolean flag=false;
            int a=sc.nextInt();
            if(a>=s)
                flag=true;
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                a= sc.nextInt();
                if(a-b>=s)
                    flag=true;
            }
            a= sc.nextInt();
            if(m-a>=s)
                flag=true;
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
