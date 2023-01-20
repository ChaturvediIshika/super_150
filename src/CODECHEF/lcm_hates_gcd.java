package CODECHEF;

import java.util.Scanner;

public class lcm_hates_gcd {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int l=1,h=B;
            int min=B;
            int ans=0;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(check(A,B,mid)>min){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                    min=check(A,B,mid);
                    ans=mid;
                }
            }
            System.out.println(ans);
        }
    }
    public static int check(int a,int b,int mid){
        int g=gcd(b,mid);
        int l=lcm(a,mid);
        return l-g;
    }
    public static int gcd(int a,int x){
        int num2=a>x?x:a;
        int num1=a>x?a:x;
        while(num2 != 0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static int lcm(int b,int x){
        return (b*x)/gcd(b,x);
    }
}
