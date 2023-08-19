import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s[]=new String[n];
        HashMap<String,String> map=new HashMap<>();
        for (int i=0;i<n;i++){
            s[i]=sc.next();
        }
        Arrays.sort(s);
        for (int i=0;i<n;i++){
            String str[]=s[i].split("@");
            if(!map.containsKey(str[1]))
                map.put(str[1],s[i]);
        }
        for (String k:map.keySet())
            System.out.println(map.get(k));
    }
}
