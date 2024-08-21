package Inflearn.AdjacencyList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7_13 {
    static int n,m,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public static void main(String[] args) {
        Q7_13 main = new Q7_13();
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        n = in.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= m; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int first = in.nextInt();
            int sec = in.nextInt();
            graph.get(first).add(sec); // 여기서 ArrayList에 초기화되며 값이 들어감
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v){

        if(v == m) answer++;
        else{
            for(int cur : graph.get(v)){
                if(ch[cur] == 0){
                    ch[cur] = 1;
                    DFS(cur);
                    ch[cur] = 0;
                }
            }
        }

    }
}
