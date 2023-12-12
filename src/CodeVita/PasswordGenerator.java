package CodeVita;


import java.util.HashMap;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        outer:
        while (t-->0){
            sc.nextLine();
            String s[]=sc.nextLine().split(" ");
//            System.out.println(Arrays.toString(sc.nextLine().split(" ")));
            String s1=s[0];
//            System.out.println(s1);
            String s2= s[1];
//            System.out.println(s2);
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)=='.')
                    continue ;
                if(s1.charAt(j)>'9' || s1.charAt(j)<'0'){
                    System.out.println("Invalid");
                    continue outer;
                }
            }
            int i=0;
            boolean flag=false;
            while(i<s1.length()){
                if(s1.charAt(i)=='0')
                i++;
                else if (s1.charAt(i)=='.'){
                    flag=true;
                    i++;
                }
                else
                    break;
            }
            int q=s1.charAt(i)-'0';
            s1=s1.substring(i+1);
            String l=s1.length()+"";
            int c1=0,c2=0;
            while (s1.length()>=1){
                int sum=0;
                for(int j=0;j<s1.length();j++){
                    sum+=s1.charAt(j)-'0';
                }
                if(sum>=10){
                    s1=sum+"";
                }
                else{
                    c1=sum;
                    break;
                }
            }
//            System.out.println(c1);
            while (l.length()>=1){
                int sum=0;
                for(int j=0;j<l.length();j++){
                    sum+=l.charAt(j)-'0';
                }
                if(sum>=10){
                    l=sum+"";
                }
                else{
                    c2=sum;
                        break;
                }
            }
            HashMap<Integer,String> map=new HashMap<>();
            map.put(0,"zer");
            map.put(1,"one");
            map.put(2,"two");
            map.put(3,"thr");
            map.put(4,"fou");
            map.put(5,"fiv");
            map.put(6,"six");
            map.put(7,"sev");
            map.put(8,"eig");
            map.put(9,"nin");
            String p="e+";
            if(flag) {
                p = "e-";
                c2++;
            }
//            System.out.println(q+" "+c2);
            s1=map.get(q)+"."+map.get(c1)+p+map.get(c2);
            String sz="";
            if(c2%2==0){
                for(int j=1;j<s2.length();j+=2)
                    sz+=s2.charAt(j);
            }
            else{
                for(int j=0;j<s2.length();j+=2)
                    sz+=s2.charAt(j);
            }
            System.out.println(s1+"@"+sz);
        }
    }
}
