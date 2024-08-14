package Codeforces_Daily_Question;

import java.util.Scanner;

public class PrimaryTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s= sc.next();
            if(s.length()==1)
                System.out.println("NO");
            else{
                if(s.charAt(0)=='1' && s.charAt(1)=='0'){
                    if(s.length()==3 && s.charAt(2)=='1')
                        System.out.println("NO");
                    else if(s.length()>=3 && s.charAt(2)!='0')
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else
                    System.out.println("NO");
            }
        }
    }
}
