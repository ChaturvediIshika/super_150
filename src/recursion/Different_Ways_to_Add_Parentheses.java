package recursion;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses {
    public static void main(String[] args) {
        String str="2*3-4*5";
        System.out.println(ways(str));
    }
    public static List<Integer> ways(String s){
        if(s.indexOf('+')==-1 && s.indexOf('-')==-1 && s.indexOf('*')==-1){
            List<Integer> ls=new ArrayList<>();
            ls.add(Integer.parseInt(s));
            return ls;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (isoperator(ch)){
                List<Integer> l=ways(s.substring(0,i));
                List<Integer> r=ways(s.substring(i+1));
                for (int a:l){
                    for (int b:r){
                        int c=calcu(a,b,ch);
                        ans.add(c);
                    }
                }
            }
        }
        return ans;
    }
    public static int calcu(int a,int b,char ch){
        if(ch=='+')
            return a+b;
        if (ch=='-')
            return a-b;
        return a*b;
    }
    public static boolean isoperator(char ch){
        if (ch=='+' || ch=='-' ||ch=='*')
            return true;
        return false;
    }
}
