package DP;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        System.out.println(distinct(s,t,0,0));
    }
    public static int distinct(String s,String t,int i,int j){
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=distinct(s,t,i+1,j+1);
        }
        exc=distinct(s,t,i+1,j);
        return inc+exc;
    }
}
