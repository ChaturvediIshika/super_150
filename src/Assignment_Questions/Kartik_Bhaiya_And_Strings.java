package Assignment_Questions;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        String str="ababbbbaaaba";
        int k=3;
        int a=flip(k,str,'a');
        int b=flip(k,str,'b');
        System.out.println(Math.max(a,b));
    }
    public static int flip(int k,String str,char ch)
    {
        int ei=0,si=0,ans=0,flip=0;
        while(ei<str.length())
        {
            if(str.charAt(ei)==ch)
                flip++;
            while (flip>k && si<=ei)
            {
                if(str.charAt(si)==ch)
                    flip--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
