package Codeforces_Daily_Question;

import java.util.Scanner;

public class AddOddorSubtractEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b)
                System.out.println(0);
            else if(a<b){
                if((b-a)%2==1)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
           else{
                if((a-b)%2==1)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
        }
    }
}
