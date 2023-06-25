package Codeforces_Daily_Question;

import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        int ei=1,si=0,max=0;
        while(si<ei && ei<n){
            if(a[ei]<a[ei-1]){
                max=Math.max(max,ei-si);
                si=ei;
            }
            ei++;
        }
        max=Math.max(max,ei-si);
        System.out.println(max);
    }
}
