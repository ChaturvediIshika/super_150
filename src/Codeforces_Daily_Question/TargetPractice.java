package Codeforces_Daily_Question;

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int sum=0;
            int n=10;
            while (n-->0){
                String s= sc.next();
                for(int i=0;i<10;i++){
                    if(s.charAt(i)=='X'){
                        if(n==9 || n==0 || i==0 || i==9)
                            sum+=1;
                        else if (n==8 || n==1 || i==1||i==8)
                            sum+=2;
                        else if (n==7 || n==2 || i==2||i==7)
                            sum+=3;
                        else if (n==6 || n==3 || i==3||i==6)
                            sum+=4;
                        else if (n==5 || n==4 || i==4||i==5)
                            sum+=5;
                    }
                }
//                System.out.println(sum);
            }
            System.out.println(sum);
        }
    }
}
