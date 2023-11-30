package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Twogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        HashMap<String,Integer> hs=new HashMap();
        for(int i=0;i<n-1;i++){
            hs.put(s.substring(i,i+2),hs.getOrDefault(s.substring(i,i+2),0)+1);
        }
        int max=0;
        String str="";
        for(String k:hs.keySet()){
            if(hs.get(k)>max){
                max=hs.get(k);
                str=k;
            }
        }
        System.out.println(str);
    }
}
