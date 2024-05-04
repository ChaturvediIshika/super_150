package Codeforces_Daily_Question;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int arr[]=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            boolean s1=false;
            for(int i=0;i<4;i++){
                int temp[]={arr[2],arr[0],arr[3],arr[1]};
                arr=temp;
                if(arr[0]<arr[1] && arr[0]<arr[2] && arr[3]>arr[1] && arr[3]>arr[2])
                    s1=true;
            }
            System.out.println(s1 ? "YES":"NO");
        }
    }
}
