package Bit_Masking;

import java.util.Scanner;

public class Avengers_End_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]={2,3,5};
        while (t-->0){
            int n= sc.nextInt();
            System.out.println(count(n,a));
        }
    }
    public static int count(int n,int a[]){
        int ans=0;
        for(int i=1;i<(1<<a.length);i++){
            int c=countnum(i,n,a);
            if(countsetbit(i)%2==0){
                ans-=c;
            }
            else {
                ans+=c;
            }
        }
        return ans;
    }
    public static int countnum(int i,int n,int a[]){
        int pos=0,pod=1;
        while (i>0) {
            if ((i & 1) != 0) {
                pod *= a[pos];
            }
            pos++;
            i >>= 1;
        }
        return n/pod;
    }
    public static int countsetbit(int n){
        int c=0;
        while (n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
