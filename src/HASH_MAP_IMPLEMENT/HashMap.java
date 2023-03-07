package HASH_MAP_IMPLEMENT;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class HashMap<K,V> {
    public class Node {
        K key;
        V value;
        Node next;

        public Node() {
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Node> bucketArray;
    int size = 0;

    public HashMap(int x) {
        this.bucketArray = new ArrayList<>();
        for (int i = 0; i < x; i++)
            this.bucketArray.add(null);
    }

    public HashMap() {
        this(4);
    }

    public int hashfunction(K key) {
        int bn = key.hashCode() % this.bucketArray.size();
        if (bn < 0)
            bn = bn + this.bucketArray.size();
        return bn;
    }

    public void put(K key, V value) {
        int bn = hashfunction(key);
        Node temp = this.bucketArray.get(bn);
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node(key, value);
        nn.next = this.bucketArray.get(bn);
        this.bucketArray.set(bn, nn);
        this.size++;
        double loadf=(1.0*this.size)/this.bucketArray.size();
        double thf=2.0;
        if(loadf>thf)
            rehashing();
    }
    private void rehashing(){
        ArrayList<Node> nba=new ArrayList<>();
        for (int i=0;i<this.bucketArray.size()*2;i++)
            nba.add(null);
        ArrayList<Node> oba=this.bucketArray;
        this.bucketArray=nba;
        this.size=0;
        for(Node temp:oba){
            while (temp!=null){
                put(temp.key,temp.value);
                temp=temp.next;
            }
        }
    }

    public V get(K key) {
        int bn = hashfunction(key);
        Node temp = this.bucketArray.get(bn);
        while (temp != null) {
            if (temp.key.equals(key))
                return temp.value;
            temp = temp.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        int bn = hashfunction(key);
        Node temp = this.bucketArray.get(bn);
        while (temp != null) {
            if (temp.key.equals(key))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public V remove(K key) {
        int bn = hashfunction(key);
        Node curr = this.bucketArray.get(bn);
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key))
                break;
            prev = curr;
            curr = curr.next;
        }
        if (curr == null)
            return null;
        if (prev == null) {
            this.bucketArray.set(bn, curr.next);
            curr.next = null;
        } else {
            prev.next = curr.next;
            curr.next = null;
        }
        this.size--;
        return curr.value;
    }
    public String toString(){
        String s="{ ";
        for(Node temp:this.bucketArray){
            while (temp!=null){
                s=s+temp.key+"="+temp.value+", ";
                temp=temp.next;
            }
        }
        s=s.substring(0,s.length()-2)+"}";
        return s;
    }

}
