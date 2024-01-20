package Codeforces_Daily_Question;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int x[]=new int[4];
            int y[]=new int[4];
            for(int i=0;i<4;i++){
                x[i]= sc.nextInt();
                y[i]=sc.nextInt();
            }
            int x1=x[0],x2=0;
            int y1=y[0];
            for(int i=1;i<4;i++){
                if(y[i]==y1)
                    x2=x[i];
            }
            System.out.println((x2-x1)*(x2-x1));
        }
    }
}
