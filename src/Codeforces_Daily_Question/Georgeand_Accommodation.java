package Codeforces_Daily_Question;

import java.sql.SQLType;
import java.util.Scanner;

public class Georgeand_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        while (n-->0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(p+2<=q)
                c++;
        }
        System.out.println(c);
    }
}
