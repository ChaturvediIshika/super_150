package recursion;

public class Key_Pad {
    public static void main(String[] args) {
        String q="23";
        print(q,"");
    }
    static String key[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void print(String q,String a)
    {
        if(q.length()==0)
        {
            System.out.println(a);
            return;
        }
        char n=q.charAt(0);
        String r=key[n-48];
        for(int i=0;i<r.length();i++)
        {
            print(q.substring(1),a+r.charAt(i));
        }
    }
}
