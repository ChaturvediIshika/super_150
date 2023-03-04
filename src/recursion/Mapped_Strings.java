package recursion;

import java.util.HashSet;

public class Mapped_Strings {
    static char ch[]={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
    'W','X','Y','Z'};
    public static void main(String[] args) {
        int n=123;
        HashSet<String> hs=new HashSet<>();
        print(n,"",hs);
        for(String str:hs){
            System.out.println(str);
        }
    }
    public static void print(int n,String s,HashSet<String> hs){
        if(n==0){
            String str="";
            for (int i=s.length()-1;i>=0;i--)
                str+=s.charAt(i);
            hs.add(str);
            return;
        }
        if(n%10<=26)
        print(n/10,s+ch[n%10],hs);
        if(n%100<=26)
        print(n/100,s+ch[n%100],hs);
    }
}
