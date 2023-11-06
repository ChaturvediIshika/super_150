package Codeforces_Daily_Question;

import java.util.Scanner;

public class WordonthePaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str="";
            for (int i=0;i<8;i++){
                String s=sc.next();
                for (int j=0;j<8;j++){
                    if(s.charAt(j)!='.')
                        str+=s.charAt(j);
                }
            }
            System.out.println(str);
        }
    }
}
