package Codeforces_Daily_Question;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2= sc.next();
        boolean flag=false;
        for(int i=0,j=str2.length()-1;i<str1.length();i++,j--){
            if(str1.charAt(i)!=str2.charAt(j)){
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
