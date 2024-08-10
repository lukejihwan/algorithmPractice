package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Q7_08 {

    private static void BFS(Node root){

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(len + " : ");
            for(int i = 0; i < len; i++){
                Node pol = Q.poll();
                System.out.print(pol.data + " ");
                if(pol.lt != null) Q.offer(pol.lt);
                if(pol.rt != null) Q.offer(pol.rt);
            }
            level++;
            System.out.println(level);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);
    }
}

class Node{
    int data;
    Node lt, rt, ct, bt, ht;
    public Node(int data){
        this.data = data;
    }
}
