package Codeforces;

import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str=sc.next();
            System.out.println(find(str));
        }
    }
    public static int find(String str){
        int i=0,j=str.length()-1,c=str.length();
        while (i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                i++;
                j--;
                c-=2;
            }
            else
                return c;
        }
        return 0;
    }
}
