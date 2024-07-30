package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        char ch[]=new char[n];
        if(n%2!=0){
            int j=(n-1)/2-1;
            int k=(n-1)/2+1;
            ch[(n-1)/2]=s.charAt(0);
            for(int i=1;i<n;i+=2){
                ch[j]=s.charAt(i);
                ch[k]=s.charAt(i+1);
                j--;
                k++;
            }
        }
        else{
            int j=(n-1)/2;
            int k=(n-1)/2+1;
            for(int i=0;i<n;i+=2){
                ch[j]=s.charAt(i);
                ch[k]=s.charAt(i+1);
                j--;
                k++;
            }
        }
        String str="";
        for(int i=0;i<n;i++){
            str+=ch[i];
        }
        System.out.println(str);
    }
}
