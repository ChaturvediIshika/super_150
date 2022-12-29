package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Single_Threaded_CPU {
    public static void main(String[] args) {//[[1,2],[2,4],[3,2],[4,1]]
        int task[][]={{1,2},{2,4},{3,2},{4,1}};
        int q[]=thread(task);
        for (int i:q)
            System.out.println(i);
    }
    public static int[] thread(int task[][]){
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a,b)->(a[1]!=b[1]?a[1]-b[1]:a[2]-b[2]));
        int st[][]=new int[task.length][3];
        for(int i=0;i< task.length;i++){
            st[i][0]=task[i][0];
            st[i][1]=task[i][1];
            st[i][2]=i;
        }
        Arrays.sort(st,(a,b)->Integer.compare(a[0],b[0]));
        int tpo[]=new int[task.length];
        long time=0;
        int ti=0,ai=0;
        while (ti < task.length || !pq.isEmpty()) {
            if (pq.isEmpty() && time<st[ti][0]) {
                time=st[ti][0];
            }
            while (ti< task.length && time>=st[ti][0]){
                pq.add(st[ti]);
                ti++;
            }
            int pt=pq.peek()[1];
            int idx=pq.peek()[2];
            pq.remove();
            time+=pt;
            tpo[ai++]=idx;

        }
        return tpo;
    }
}
