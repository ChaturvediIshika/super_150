package Codeforces;

import java.util.Scanner;

public class Serval_and_Inversion_Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int q=pallindrome(str,n);
            if (q==0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    public static int pallindrome(String str,int n){
        int i=0,j=n-1;
        int flag=-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j));
            else {
                if (flag==-1)
                    flag=i;
                else if (i==flag+1) {
                    flag++;
                }
                else
                    return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
