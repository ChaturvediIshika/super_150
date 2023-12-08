package Codeforces_Daily_Question;

import java.util.Scanner;

public class DeletionsofTwoAdjacentLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s= sc.next();
            char c=sc.next().charAt(0);
            System.out.println(find(s,c));
        }
    }
    public static String find(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c && (i)%2==0 && (s.length()-i-1)%2==0)
                return "YES";
        }
        return "NO";
    }
}
