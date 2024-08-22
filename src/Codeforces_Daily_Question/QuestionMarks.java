package Codeforces_Daily_Question;

import java.util.Scanner;

public class QuestionMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=0,b=0,c=0,d=0;
            String s= sc.next();
            for(int i=0;i<4*n;i++){
                if(s.charAt(i)=='A')
                    a++;
                if(s.charAt(i)=='B')
                    b++;
                if(s.charAt(i)=='C')
                    c++;
                if(s.charAt(i)=='D')
                    d++;
            }
            int win=a<n?a:n;
            win+=b<n?b:n;
            win+=c<n?c:n;
            win+=d<n?d:n;
            System.out.println(win);
        }
    }
}
