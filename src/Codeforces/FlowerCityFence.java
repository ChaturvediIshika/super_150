package Codeforces;

import java.util.Scanner;

public class FlowerCityFence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]=sc.nextInt();
            if(a[0]!=n){
                System.out.println("NO");
                continue;
            }
            boolean flag=true;
            for (int i=1;i<n;i++){
                if(a[a[i]-1]<i+1){
                    flag=false;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
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
}
