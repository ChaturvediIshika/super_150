package Advance_topics;

public class Longest_Duplicate_Substring {
    public static void main(String[] args) {
        String s="banana";
    }
    public static String substring(String s){
        int lo=0;
        int hi=s.length();
        String ans="";
        while (lo<=hi){
            int mid=(lo+hi)/2;
            ans=solve(s,mid);
            if(ans.length()>0)
                lo=mid+1;
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
    public static String solve(String s,int mid){
        long mod=1000_000_007;
        int pow=1;
        long ans=0;
        int prime=31;
        for(int ei=mid-1;ei>=0;ei--){
            ans=(ans+((s.charAt(ei)-'a'+1)*pow)%mod)%mod;

        }
        return null;
    }
}