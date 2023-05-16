package Assignment_4440;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int j=-1,sum=0,ans=0;
        for (int i=0;i<n;i++){
            if(sum+a[i]<=t)
                sum+=a[i];
            else {
                sum+=a[i];
                while (sum>t){
                    j++;
                    sum-=a[j];
                }
            }
            ans=Math.max(ans,i-j);
        }
        System.out.println(ans);
    }
}
