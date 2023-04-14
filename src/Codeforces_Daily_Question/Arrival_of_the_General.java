package Codeforces_Daily_Question;

import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,j=0,k=0;
        for (int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                j=i;
            }
            if(a[i]<=min){
                min=a[i];
                k=i;
            }
        }
        int c=0;
//        System.out.println(max+" "+j+" "+min+" "+k);
        for(int i=k;i<n-1;i++){
            int temp=a[i+1];
            a[i+1]=a[i];
            a[i]=temp;
            c++;
//            System.out.println("yhckl");
        }
        if(j>=k && j<n)
            j--;
        for(int i=j;i>0;i--){
            int temp=a[i];
            a[i]=a[i-1];
            a[i-1]=temp;
            c++;
        }
//        for (int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
        System.out.println(c);
    }
}
