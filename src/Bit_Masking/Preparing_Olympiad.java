package Bit_Masking;

import java.util.Scanner;

public class Preparing_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int l=sc.nextInt();
        int r= sc.nextInt();
        int x= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(countcontest(a,l,r,x));
    }
    public static int countsetbit(int n){
        int c=0;
        while (n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
    public static int countcontest(int a[],int l,int r,int x){
        int n=a.length,ans=0;
        for(int i=3;i<(1<<n);i++){
            if(countsetbit(i)>1){
                if(isitposible(a,l,r,x,i)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static boolean isitposible(int a[],int l,int r,int x,int i){
        int sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,pos=0;
        while (i>0){
            if((i&1)!=0){
                sum+=a[pos];
                max=Math.max(max,a[pos]);
                min=Math.min(min,a[pos]);
            }
            i>>=1;
            pos++;
        }
        if(sum>=l && sum<=r && (max-min)>=x)
            return true;
        return false;
    }
}
