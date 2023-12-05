import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="",s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                continue;
            }
            s1+=s.charAt(i);
        }
//        if(s1.length()!=s.length())
//            System.out.println("Contains numbers");
//        else {
//            for (int i = 0; i < s.length(); i++) {
//                s2 += s1.charAt(i);
//            }
//            System.out.println(s2);
//        }
        System.out.println(s1);
    }
}
