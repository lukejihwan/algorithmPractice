package BaekJoon;

import java.io.*;

public class Q24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*MenOfPassion(A[], n) {
            sum <- 0;
            for i <- 1 to n - 2
                for j <- i + 1 to n - 1
                    for k <- j + 1 to n
                        sum <- sum + A[i] × A[j] × A[k]; # 코드1
            return sum;
        }
        알고리즘 시간 복잡도 문제
        * */

        long N = Integer.parseInt(br.readLine());

        bw.write(N * N * N + "\n");
        bw.write(3 + "");

        br.close();
        bw.close();
    }
}
