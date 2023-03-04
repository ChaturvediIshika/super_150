package Codeforces;

import java.util.Scanner;

public class Serval_and_Mochas_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++) {
                for (int j = i + 1; j < n; j++) {
                    if (greatest(arr[i], arr[j]) <= 2){
                        flag=1;
                        break;
                    }
//                        System.out.println("YES");
                }
            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static int greatest(int k,int l){
        if(l==0)
            return k;
        return greatest(l,k%l);
    }
}
