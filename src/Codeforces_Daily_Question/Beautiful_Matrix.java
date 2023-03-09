package Codeforces_Daily_Question;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int q=sc.nextInt();
                if(q==1){
                    a=i;
                    b=j;
                }
            }
        }
        if((a==0 && b==0)||(a==4 && b==4) || (a==0 && b==4)||(a==4 && b==0))
            System.out.println(4);
        else if((a==1 && b==0) ||(a==0 && b==1) ||(a==0 && b==3) ||(a==1 && b==4) ||(a==3 && b==0) ||(a==4 && b==1) ||(a==4 && b==3) ||(a==3 && b==4))
            System.out.println(3);
        else if((a==2 && b==0) ||(a==0 && b==2) ||(a==1 && b==1) ||(a==1 && b==3) ||(a==2 && b==4) ||(a==3 && b==3) ||(a==4 && b==2) ||(a==3 && b==1))
            System.out.println(2);
        else if((a==1 && b==2) ||(a==2 && b==3) ||(a==3 && b==2) ||(a==2 && b==1))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
