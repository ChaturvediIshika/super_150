package Codeforces_Daily_Question;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s= sc.next();
            for(int i=0;i<8;i++){
                if(s.charAt(0)==(char)('a'+i)||s.charAt(1)==(char)('1'+i))
                    continue;
                System.out.println(((char)('a'+i))+""+s.charAt(1));
                System.out.println(s.charAt(0)+""+(char)('1'+i));
            }

        }
    }
}
