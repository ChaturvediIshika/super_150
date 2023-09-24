package Codeforces_Daily_Question;

import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str= sc.next();
            int c=0,m=0,k=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='(')
                    c++;
                else if(str.charAt(i)==')' && c>0)
                    c--;
                else
                    m++;
            }
            System.out.println(m);
        }
    }
}
