package Codeforces_Daily_Question;

import java.util.Scanner;

public class MKnezs_ConstructiveForces_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0) {
                System.out.println("YES");
                for(int i=0;i<n;i++){
                    if(i%2==0)
                        System.out.print(1+" ");
                    else
                        System.out.print(-1+" ");
                }
                System.out.println();
            }
            else if(n==3){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                for (int i=0;i<n;i++){
                    if(i%2==0)
                        System.out.print((3-n)+" ");
                    else
                        System.out.print((n-1)+" ");
                }
                System.out.println();
            }
        }
    }
}
