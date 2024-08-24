package Inflearn.AdjacencyList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리 (BFS)
public class Q7_14 {
    static int[][] graph;
    static int[] ch;

    // 목적 : 각 노드의 최단거리를 출력
    // 출력형태 : node번호 : level
    private void BFS(int n){
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        int level = 0;
        while (!q.isEmpty()){
            for(int i = 0; i < q.size(); i++){
                int cur = q.poll();
                for(int j = 1; j <= ch.length; j++){
                    if(graph[cur][j] == 1 && ch[j] == 0){
                        System.out.println(j + " : " + ++level);
                        ch[j] = 1;

                    }


                }
            }

        }

    }
    public static void main(String[] args) {
        Q7_14 main = new Q7_14();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        /* 준비 */
        // 접근한 node를 체크하기 위한 배열
        ch = new int[n + 1];

        // graph 설정
        graph = new int[n + 1][n + 1];

        // 연결된 간선들을 그래프에 저장
        for (int i = 1; i < m; i++){
            int first = in.nextInt();
            int second = in.nextInt();
            graph[first][second] = 1;
        }

        ch[1] = 1;
        main.BFS(1); // 어떤 숫자를 넣어야 할까?

    }
}
