package Codeforces_Daily_Question;

import java.util.Scanner;

public class PetrandBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[7];
        for(int i=0;i<7;i++)
            a[i]= sc.nextInt();
        int sum=0,k=0;
        while (sum<=n){
            sum+=a[k];
            k++;
            if(k==7)
                k=0;
        }
        System.out.println(k);
    }
}
