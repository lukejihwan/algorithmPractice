package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class Q2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int average = 0;
        int middle = 0;

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 평균 구하기
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += arr[i];
        }
        average = sum / 5;

        // 중앙값 구하기
        Arrays.sort(arr);

        middle = arr[2];

        bw.write(average + "\n");
        bw.write(middle + "\n");
        br.close();
        bw.close();

    }
}
