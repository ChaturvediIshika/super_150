package recursion;

public class Mapped_Strings {
    static char ch[]={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
    'W','X','Y','Z'};
    public static void main(String[] args) {
        int n=1128;
        print(n,"");
    }
    public static void print(int n,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(n%100<=26)
        print(n/100,s+ch[n%100]);
        if(n%10<=26)
        print(n/10,s+ch[n%10]);
    }
}
