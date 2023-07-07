package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Registration_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        while (n-->0){
            String str=sc.next();
            if (map.containsKey(str)){
                System.out.println(str+(map.get(str)+1));
                map.put(str,map.get(str)+1);
                map.put(str+(map.get(str)+1),0);
            }
            else {
                map.put(str,0);
                System.out.println("OK");
            }
        }
    }
}
