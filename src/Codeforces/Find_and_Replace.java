package Codeforces;

import java.util.Scanner;

public class Find_and_Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str=sc.next();
            if(find(n,str))
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
}
