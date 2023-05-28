package Assignment_4440;

import java.util.Scanner;

public class Nidhi_Interview_Experience {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(interview(a,k));
    }
    public static int interview(int a[],int k){
        int min=Integer.MAX_VALUE;
        int ei=0,si=0,sum=0;
        while (si<=ei && ei<a.length){
            sum+=a[ei];
            if(sum>=k){
                min=Math.min(min,ei-si+1);
            }
            else if(sum>=k && sum+a[ei]<k){
                sum=0;
                si=ei;
            }
            ei++;
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
}
