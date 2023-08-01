package Codeforces_Daily_Question;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int s1=0,s2=0;
            for(int i=0;i<3;i++){
                s1+=n%10;
                n=n/10;
            }
            for(int i=0;i<3;i++){
                s2+=n%10;
                n=n/10;
            }
            if(s1==s2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
