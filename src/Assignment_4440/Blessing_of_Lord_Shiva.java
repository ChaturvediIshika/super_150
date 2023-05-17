package Assignment_4440;

import java.util.Scanner;

public class Blessing_of_Lord_Shiva {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
//            System.out.println(str);
            int ca=0,cb=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)-'a'!=i%2)
                    ca++;
                else
                    cb++;
            }
            System.out.println(Math.min(ca,cb));
        }
    }
}
