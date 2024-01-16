import java.util.Locale;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter e:encode, d:decode, b:brute force");
        char ch=sc.next().charAt(0);
        System.out.println("Enter message");
        String s= sc.next();
        switch (ch){
            case 'e':
                System.out.println("Enter shift");
                int k= sc.nextInt();
                encrypt(s,k);
                break;
            case 'd':
                System.out.println("Enter shift");
                k= sc.nextInt();
                decrypt(s,k);
                break;
            case 'b':
                brute(s);
                break;
        }
    }
    public static void encrypt(String s,int shift){
        s=s.toUpperCase();
        String str="";
        for(int i=0;i<s.length();i++){
            str+=(char)(65+(s.charAt(i)-'A'+shift)%26);
        }
        System.out.println(str);
    }
    public static void decrypt(String s,int shift){
        s=s.toUpperCase();
        String str="";
        for(int i=0;i<s.length();i++){
            str+=(char)(97+(s.charAt(i)-'A'+26-shift)%26);
        }
        System.out.println(str);
    }
    public static void brute(String s){
        s=s.toUpperCase();
        for (int i=0;i<26;i++){
            String str="";
            for(int j=0;j<s.length();j++){
                str+=(char)(65+(s.charAt(j)-'A'+i)%26);
            }
            System.out.println(i+" "+str);
        }
    }
}
