package leetcode;

public class Rotate_String {
    public static void main(String[] args) {
        String str="abcde";
        String str2="abced";
        if(rotate(str,str2))
            System.out.println("true");
        else
            System.out.println("False");
    }
    public static boolean rotate(String str1,String str2)
    {
        int l=str1.length();
        for(int i=0;i<l;i++)
        {
            char ch=str1.charAt(l-1);
            str1=ch+str1.substring(0,l-1);
            if(str1.equals(str2))
                return true;
        }
        return false;
    }
}
