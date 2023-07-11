package Codeforces_Daily_Question;

import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[k];
        for (int i=0;i<k;i++)
            a[i]=sc.nextInt();
        long sum=a[0]-1;
        for(int i=1;i<k;i++){
            if(a[i]>a[i-1]){
                sum+=a[i]-a[i-1];
            }
            else if(a[i]==a[i-1])
                continue;
            else{
                sum+=n-a[i-1]+a[i];
            }
        }
        System.out.println(sum);
    }
}
