package Codeforces_Daily_Question;

import java.util.Scanner;

public class FriendsandCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                sum+=a[i];
            }
            if(sum%n!=0){
                System.out.println(-1);
            }
            else{
                int c=0;
                for(int i:a){
                    if(i>sum/n)
                        c++;
                }
                System.out.println(c);
            }
        }
    }
}
