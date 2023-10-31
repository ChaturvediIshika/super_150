package Codeforces_Daily_Question;

import java.util.Scanner;

public class ConstructtheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            char ch='a';
            String str="";
            for (int i=0;i<n;i++){
                str+=(char)(ch+i%a%b);
            }
            System.out.println(str);
        }
    }
}
