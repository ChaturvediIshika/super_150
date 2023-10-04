package Codeforces_Daily_Question;

import java.util.Scanner;

public class IlyaandQueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int a[]=new int[s.length()];
        int c=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))
                c++;
            a[i]=c;
        }
        int t= sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r= sc.nextInt();
            System.out.println(a[r-1]-a[l-1]);
        }
    }
}
