package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class NotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s[]=new String[3];
            boolean a=false,b=false,c=false;
            for(int i=0;i<3;i++)
                s[i]=sc.next();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(s[i].charAt(j)=='?'){
                        for (int k=0;k<3;k++){
                            if(s[i].charAt(k)=='A')
                                a=true;
                            if(s[i].charAt(k)=='B')
                                b=true;
                            if(s[i].charAt(k)=='C')
                                c=true;
                        }
                    }
                }
            }
            if(a&&b)
                System.out.println("C");
            else if(b&&c)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}
