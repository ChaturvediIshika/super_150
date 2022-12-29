package GFG_POTD;

import java.util.*;
import java.util.Set;

//        4 0 2
//        3 5 7
//        8 1 6
public class Missing_number_in_matrix {
    public static void main(String[] args) {
        int matrix[][]={{4,0,2}, {3,5,7},{8,1,6}};
        System.out.println(MissingNo(matrix));
    }
    public static long  MissingNo(int[][] matrix){
        Set<Long> zz=new HashSet<>();
        Set<Long> nz=new HashSet<>();
        long sum=0;
        boolean flag=false;
        for(int i=0;i< matrix.length;i++){
            flag=false;
            sum=0;
            for(int j=0;j< matrix.length;j++){
                sum+=matrix[i][j];
                if(matrix[i][j]==0) {
                    flag = true;
                }
            }
            if(flag==true){
                zz.add(sum);
//                System.out.println(sum+" zz");
            }
            else {
                nz.add(sum);
//                System.out.println(sum);
            }
        }
        for(int i=0;i< matrix.length;i++){
            flag=false;
            sum=0;
            for(int j=0;j< matrix.length;j++){
                sum+=matrix[j][i];
                if(matrix[j][i]==0) {
                    flag = true;
                }
            }
            if(flag==true){
                zz.add(sum);
//                System.out.println(sum+" zz");
            }
            else {
                nz.add(sum);
//                System.out.println(sum);
            }
//            System.out.println(sum);
        }
        sum=0;
        flag=false;
        for(int i=0;i< matrix.length;i++){
            sum += matrix[i][i];
            if (matrix[i][i] == 0) {
                flag = true;
            }
        }
        if(flag==true){
            zz.add(sum);
        }
        else
            nz.add(sum);
//        System.out.println(sum);

        sum=0;
        flag=false;
        for(int i=0;i< matrix.length;i++){
            sum+=matrix[i][matrix.length-1-i];
            if(matrix[i][matrix.length-1-i]==0) {
                flag = true;
            }
        }
        if(flag==true){
            zz.add(sum);
        }
        else
            nz.add(sum);
//        System.out.println(sum);
        long sum1=0,sum2=0;
        for(long s:nz) {
//            System.out.println(s);
            sum1 = s;
        }
        for (long s:zz){
//            System.out.println(s);
            sum2=s;}
        if(nz.size()>1 || zz.size()>1) {
//            System.out.println("vhv "+nz.size()+" "+zz.size());
            return -1;
        }
        else if(sum1>sum2) {
//            System.out.println("yru");
            return sum1 - sum2;
        }
        return -1;
    }
}
