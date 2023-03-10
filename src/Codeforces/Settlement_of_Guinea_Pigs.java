package Codeforces;

import java.util.Scanner;

public class Settlement_of_Guinea_Pigs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String str="";
            int k=0,g=0,r=0;
            int c=0;
            for(int i=0;i<n;i++){
//                str+=sc.next();
                int a=sc.nextInt();
                if(a==1)
                    k++;
                else{
                    g+=k;
                    k=0;
                }
                if(g>0){
                    r=g/2;
                    c=Math.max(c,k+1+r);
                }
                else
                    c=Math.max(c,k);
            }
            String s="";
            for(int i=0;i<str.length();i++){
                if(i==0)
                    s+=str.charAt(i);
                else if(str.charAt(i-1)!='2' || str.charAt(i)!='2')
                    s+=str.charAt(i);
            }

            for(int i=0;i<s.length();i++){
                if(i+2<s.length() && s.charAt(i)=='1' && s.charAt(i+1)=='2' && s.charAt(i+2)=='1'){
//                    c++;
                    i+=2;
                }
                else if(i+2<s.length() && s.charAt(i)=='2' && s.charAt(i+1)=='1' && s.charAt(i+2)!='2'){
//                    c++;
                    i+=1;
                }
                else if(s.charAt(i)=='1')
                    i++;
            }
            System.out.println(c);
        }
    }
}
