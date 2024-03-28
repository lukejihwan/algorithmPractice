package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(arr, Collections.reverseOrder());
        //int와 Integer의 차이는 primitive type과 wrapper클래스의 차이이다.
        //int -> Integer, Integer -> int로 변환이 가능하고,
        //Integer는 클래스로써 메서드를 사용할 수 있다.

        bw.write(arr[K - 1] + "\n");
        br.close();
        bw.close();
    }
}
