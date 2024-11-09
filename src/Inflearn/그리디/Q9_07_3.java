package Inflearn.그리디;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9_07_3 {
    // Priority Queue로 푸는 방법
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();

        // 0 부터 넣는 이유는 n까지 탐색할 것이기 때문이다
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n + 1];
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge(b, c));

            // todo 왜 다른 방향까지 더해주나?
            graph.get(b).add(new Edge(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()){
            Edge temp = pQ.poll();
            int ev = temp.vex;
            if(ch[ev] == 0){
                ch[ev] = 1;
                answer += temp.cost;
                for(Edge ob : graph.get(ev)){
                    if(ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);

    }
}
