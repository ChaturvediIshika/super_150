package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Additive_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="112358";
        List<BigInteger> ls=new ArrayList<>();
        System.out.println(additive(str,"",ls));
    }
    public static boolean additive(String ques,String ans,List<BigInteger> ls){
        if(ques.length()==0){
            if(ls.size()>=3){
                return true;
            }
            return false;
        }
        for(int i=1;i<=ques.length();i++){
            String s1=ques.substring(0,i);
            if(nonleading(s1) && validAdditive(ls,s1)) {
                ls.add(new BigInteger(s1));
                boolean flag=additive(ques.substring(i), ans + s1 + '|',ls);
                if(flag)
                    return flag;
                ls.remove(ls.size()-1);
            }
        }
        return false;
    }
    public static boolean nonleading(String str){
        if(str.length()==1)
            return true;
        return str.charAt(0)!='0';
    }
    public static boolean validAdditive(List<BigInteger> ls,String s1){
        if(ls.size()==1)
            return true;
        BigInteger f1=ls.get(ls.size()-1);
        BigInteger f2=ls.get(ls.size()-2);
        BigInteger f3=new BigInteger(s1);
        if(f1.add(f2).equals(f3))
            return true;
        return false;
    }
}
