package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q16964 {
    // 방문 node 초기화
    static boolean[] check;

    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 간선을 통해 가능한 결과를 arrayList에 담아둔다.

        // 마지막 줄의 결과와 일치하는 것이 있으면 1 아니면 0을 출력한다.

        int count = Integer.parseInt(br.readLine());

        check = new boolean[count];

        A = new ArrayList[count];

        for(int i = 0; i < count - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
        }

    }

    private void DFS(int x){
        if (check[x] == true) {
            return;
        }
        check[x] = true;
        // x를 방문
        for (int y : A[x]) {
            if (check[y] == false) {
                DFS(y);
            }
        }

    }
}
