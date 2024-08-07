package Inflearn.BFS;

public class Q7_08 {

    private static void BFS(Node root){

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
    Node lt, rt;
    public Node(int data){
        this.data = data;
    }
}
