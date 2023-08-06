package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String str= sc.next();
            HashSet<Character> hs=new HashSet<>();
            hs.add(str.charAt(0));
            boolean f=false;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)!=str.charAt(i-1) && hs.contains(str.charAt(i))){
                    System.out.println("NO");
                    f=true;
                    break;
                }
                else{
                    hs.add(str.charAt(i));
                }
            }
            if(!f){
                System.out.println("YES");
            }
        }
    }
}
