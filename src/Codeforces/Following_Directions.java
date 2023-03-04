package Codeforces;

import java.util.Scanner;

public class Following_Directions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str=sc.next();
            follow(str);
        }
    }
    public static void follow(String str){
        int r=0,c=0;
        for (int i=0;i<str.length();i++){

            if(str.charAt(i)=='L'){
                c--;
            } else if (str.charAt(i)=='R') {
                c++;
            } else if (str.charAt(i)=='U') {
                r++;
            }
            else
                r--;
            if (r==1&& c==1){
                System.out.println("YES");
                return;}
        }
        System.out.println("NO");
        return;
    }
}
