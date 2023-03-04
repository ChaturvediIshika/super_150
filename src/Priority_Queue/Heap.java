package Priority_Queue;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list=new ArrayList<>();
    public void add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci) {
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            Swap(pi,ci);
            upheapify(pi);
        }
    }
    public void Swap(int i,int j){
        int temp=list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
    }
    public int delete(){
        Swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(list.size()>lci && list.get(mini)>list.get(lci)){
            mini=lci;
        }
        if(list.size()>rci && list.get(pi)>list.get(rci)){
            mini=rci;
        }
        if(mini!=pi){
            Swap(mini,pi);
            downheapify(mini);
        }
    }
    public int min(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public void display(){
        System.out.println(list);
    }
    public static void main(String[] args) {
        Heap minHeap=new Heap();
        minHeap.add(3);
        minHeap.add(6);
        minHeap.add(65);
        minHeap.add(23);
        minHeap.add(78);
        System.out.println(minHeap.min());
        System.out.println(minHeap.size());
        minHeap.display();
    }
}
