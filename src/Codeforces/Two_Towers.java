package Codeforces;

import java.util.Scanner;

public class Two_Towers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            System.out.println(check(str1,str2,n1,n2));
        }
    }
    public static String check(String str1,String str2,int n1,int n2){
        int c=0;
        for(int i=str2.length()-1;i>=0;i--)
            str1+=str2.charAt(i);
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)==str1.charAt(i+1))
                c++;
        }
        if(c>1)
            return "NO";
        return "YES";
    }
}
