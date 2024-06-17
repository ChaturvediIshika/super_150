package Codeforces_Daily_Question;

import java.util.Scanner;

public class DaltontheTeacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                int k=sc.nextInt();
                if(k==i)
                    c++;
            }
            if(c%2==0){
                System.out.println(c/2);
            }
            else
                System.out.println(c/2+1);
        }
    }
}
