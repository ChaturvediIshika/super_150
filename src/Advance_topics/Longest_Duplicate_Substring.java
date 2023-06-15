package Advance_topics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Longest_Duplicate_Substring {
    public static void main(String[] args) {
        String s="banana";
        System.out.println(substring(s));
    }
    public static String substring(String s){
        int lo=0;
        int hi=s.length();
        String ans="";
        while (lo<=hi){
            int mid=(lo+hi)/2;
            String res=solve(s,mid);
            if(res.length()>0) {
                lo = mid + 1;
                ans=res;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
    public static String solve(String s,int mid){
        long mod=1000_000_007;
        long pow=1;
        long ans=0;
        int prime=31;
        for(int ei=mid-1;ei>=0;ei--){
            ans=(ans+((s.charAt(ei)-'a'+1)*pow)%mod)%mod;
            if(ei>0){
                pow=((pow*prime)%mod);
            }
        }
        HashMap<Long, List<Integer>> map=new HashMap<>();
        map.put(ans,new ArrayList<>());
        map.get(ans).add(0);
        for(int ei=mid,si=0;ei<s.length();ei++,si++){
            ans=(ans-((s.charAt(si)-'a'+1)*pow)%mod)%mod;
            ans=(ans+mod)%mod;
            ans=(ans*prime)%mod;
            ans=(ans+(s.charAt(ei)-'a'+1))%mod;
            if(map.containsKey(ans)){
                String curr= s.substring(si+1,ei+1);
                for(int st:map.get(ans)){
                    if(curr.equals(s.substring(st,st+mid))){
                        return curr;
                    }
                }
                map.get(ans).add(si+1);
            }
            else{
                map.put(ans,new ArrayList<>());
                map.get(ans).add(si+1);
            }
        }
        return "";
    }
}