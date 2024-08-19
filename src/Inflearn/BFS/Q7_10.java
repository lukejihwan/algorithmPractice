package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Q7_10 {
    Node root;
    public static void main(String[] args) {
        Q7_10 main = new Q7_10();
        main.root = new Node(1);
        main.root.lt = new Node(2);
        main.root.rt = new Node(3);
        main.root.lt.lt = new Node(4);
        main.root.lt.rt = new Node(5);
        System.out.println(main.BFS(main.root));
    }

    public int BFS(Node root){
        Queue<Node> Q = new LinkedList();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i = 0; i < size; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }
                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }
}
