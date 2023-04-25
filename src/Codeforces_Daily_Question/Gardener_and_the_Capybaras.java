package Codeforces_Daily_Question;

import java.awt.*;
import java.util.Scanner;

public class Gardener_and_the_Capybaras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
//            int pos=-1;
//            for (int i=1;i<str.length()-1;i++){
//                if (str.charAt(i)=='a'){
//                    pos=i;
//                    break;
//                }
//            }
            if(str.charAt(1)=='a')
                System.out.println(str.charAt(0)+" "+str.charAt(1)+" "+str.substring(2));
            else
                System.out.println(str.charAt(0)+" "+str.substring(1,str.length()-1)+" "+str.charAt(str.length()-1));
        }
    }
}
