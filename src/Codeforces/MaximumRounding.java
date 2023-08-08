package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumRounding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int i=0;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)-'0'>=5)
                    break;
            }
            if(i==s.length()){
                System.out.println(s);
                continue;
            }
            char[] ch=s.toCharArray();
            int j=i;
            while (j>=1 && (ch[j]-'0')>=5){
//                System.out.println(ch[j]-'0');
                ch[j-1]= (char)(ch[j-1]+1);
                j--;
            }
            if(j==0 && ch[j]-'0'>=5)
                ch[0]='0';
            for(int k=j+1;k<s.length();k++){
                ch[k]='0';
            }
            String str=new String(ch);
            if(str.charAt(0)=='0')
                str='1'+str;
            System.out.println(str);
        }
    }
}
