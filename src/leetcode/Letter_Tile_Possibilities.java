package leetcode;

public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        String str="AAB";
        String s=size(str);
        System.out.println(s);
        subsequence(s,"");
    }
    public static String size(String sq)
    {
        String s="";
        int a[]=new int[26];
        for(int i=0;i<sq.length();i++)
        {
            a[sq.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>0)
            {
                s+=(char)(i+65);
            }
        }
        return s;
    }
    public static void subsequence(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        subsequence(ques.substring(1),ans+"");
        subsequence(ques.substring(1),ans+ch);
    }
}
