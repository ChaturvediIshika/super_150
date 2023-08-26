package Codeforces;

import java.util.Scanner;

public class IceCreamBalls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            System.out.println(find(n));
        }
    }
    public static boolean find(int n ,String str){
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            for (int j=i+1;j<n;j++){
                if(str.charAt(j)==ch){
                    if((j-i)%2!=0)
                        return false;
                }
            }
        }
        return true;
    }
    public static boolean findtf(int n ,String str){
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            for (int j=i+1;j<n;j++){
                if(str.charAt(j)==ch){
                    if((j-i)%2!=0)
                        return false;
                }
            }
        }
        return true;
    }
    public static long find(long n){
        long l=2,h=Integer.MAX_VALUE;
        long ans=2;
        while (l<=h){
            long mid=l+(h-l)/2;
            if(mid*(mid-1)/2<=n){
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        ans+=n-ans*(ans-1)/2;
        return ans;
    }
}
