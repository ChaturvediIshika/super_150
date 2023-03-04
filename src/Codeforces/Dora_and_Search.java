package Codeforces;

import java.util.Scanner;

public class Dora_and_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int i=0,j=n-1;
            int flag=0;
            int min=1,max=n;
            while (i<j){
                if(arr[i]==min){
                    min++;
                    i++;
                }
                else if(arr[i]==max){
                    max--;
                    i++;
                }
                else if(arr[j]==min){
                    min++;
                    j--;
                }
                else if(arr[j]==max){
                    max--;
                    j--;
                }
                else{
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println(-1);
            else
                System.out.println(i+1+" "+(j+1));
        }
    }
}
