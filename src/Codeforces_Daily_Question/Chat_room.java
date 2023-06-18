package Codeforces_Daily_Question;

import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="hello";
        int temp=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str1.charAt(temp))
            {
                temp+=1;
            }
            if(temp==5)
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
