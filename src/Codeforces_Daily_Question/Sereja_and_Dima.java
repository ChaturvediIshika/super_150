package Codeforces_Daily_Question;

import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        int sum1=0,sum2=0,i=0,j=n-1;
        while (i<j){
            if(a[i]>a[j]){
                sum1+=a[i];
                i++;
            }
            else{
                sum1+=a[j];
                j--;
            }
            if(a[i]>a[j]){
                sum2+=a[i];
                i++;
            }
            else{
                sum2+=a[j];
                j--;
            }
        }
        if(i==j)
            sum1+=a[i];
        System.out.println(sum1+" "+sum2);
    }
}
