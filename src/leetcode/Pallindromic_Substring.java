package leetcode;

public class Pallindromic_Substring {
    public static void main(String[] args) {
        String s="nitin";
        System.out.println(pallin(s));
    }
    public static int pallin(String s)
    {
        int c=0;
        //odd
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length() && i-j>=0 && i+j<s.length();j++)
            {
                if(s.charAt(i-j)!=s.charAt(i+j))
                {
                    break;
                }
                c++;
            }
        }
        //even
        for(double i=0.5;i<s.length();i++)
        {
            for(double j=0;j<s.length() && i-j>=0 && i+j<s.length();j++)
            {
                if(s.charAt((int)(i-j))!=s.charAt((int)(i+j)))
                {
                    break;
                }
                c++;
            }
        }
        return c;
    }
}
