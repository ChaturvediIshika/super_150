package Codeforces_Daily_Question;

import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            String a=sc.next();
            String b= sc.next();
            int i=0,j=0,c=0;
            while (i<a.length() && j<b.length()){
                if(a.charAt(i)==b.charAt(j)){
                    c++;
                    i++;
                }
                j++;
            }
            System.out.println(c);
        }
    }
}
