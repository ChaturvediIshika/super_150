package Advance_topics;

import java.util.Scanner;

public class Count_Good_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        long even=0,odd=0;
        long a[][]=new long[2][2];
        for(int i=1;i<=str.length();i++){
            odd++;
            if(i%2!=0) {
                odd+=a[str.charAt(i-1)-'a'][0]++;
                even+=a[str.charAt(i-1)-'a'][1];
            }
            else{
                odd+=a[str.charAt(i-1)-'a'][1]++;
                even+=a[str.charAt(i-1)-'a'][0];
            }
        }
        System.out.println(even+" "+odd);
    }
}
