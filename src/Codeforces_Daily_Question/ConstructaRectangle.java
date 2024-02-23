package Codeforces_Daily_Question;

import java.util.Scanner;

public class ConstructaRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();
            if((a==b && c%2==0)||(c==b && a%2==0) || (a==c && b%2==0))
                System.out.println("YES");
            else{
                if((a<c && b<c && a+b==c) || (c<a && b<a && c+b==a) || (a<b && c<b && a+c==b)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
