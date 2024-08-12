package Inflearn.BFS;

import java.util.Scanner;

public class Q7_08송아지찾기 {
    int[] array;
    public static void BFS(Nodee root, int goal){


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int goal = in.nextInt();

        Nodee root = new Nodee(start);
        root.lt = new Node(start - 1);
        root.ct = new Node(start + 1);
        root.rt = new Node(start + 5);

        BFS(root, goal);

    }
}

class Nodee{
    int data;
    Node lt, ct, rt;
    public Nodee(int data){
        this.data = data;
    }
}
