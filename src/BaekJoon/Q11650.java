package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        // 배열을 이차배열에 넣는다.

        // 배열의 x배열의 오름차순으로 정렬한다.

        // 배열의 x가 같은 배열은 y배열 오름차순으로 정렬한다.

        int[][] arr = new int[count][2];
        StringTokenizer st = null;
        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        for(int i = 0; i < count; i++){
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }

        br.close();
        bw.close();

    }
}
