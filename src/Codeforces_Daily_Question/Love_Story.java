package Codeforces_Daily_Question;

import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String str=sc.nextLine();
            String str2="codeforces";
            int c=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str2.charAt(i))
                    c++;
            }
            System.out.println(c);
        }
    }
}
