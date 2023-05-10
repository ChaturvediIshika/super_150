package Codeforces_Daily_Question;

import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();
        String ans=sc.nextLine();
//        System.out.println(str+" "+str2+" "+ans);
        if(find(str,str2,ans))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean find(String str,String str2,String ans){
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<str.length();i++)
            a[str.charAt(i)-'A']++;
        for(int i=0;i<str2.length();i++)
            a[str2.charAt(i)-'A']++;
        for(int i=0;i<ans.length();i++)
            b[ans.charAt(i)-'A']++;
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
}
