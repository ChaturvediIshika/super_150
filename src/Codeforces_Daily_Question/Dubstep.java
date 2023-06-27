package Codeforces_Daily_Question;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st[]= str.split("WUB");
        str="";
        for(String s:st){
            if(!s.equals(""))
                str+=s+" ";
        }
        System.out.println(str);
    }
}
