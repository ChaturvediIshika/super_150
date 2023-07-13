package Extra;

import java.util.Scanner;

public class Pallindrome_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(check_pallindrome(str));
    }
    public static boolean check_pallindrome(String str){
        for(int i=0,j=str.length()-1;i<=str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
}
