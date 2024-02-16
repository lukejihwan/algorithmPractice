package BaekJoon;

import java.io.*;

public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 7로 해석해보자
        // i = 1 일 때 5 + 4 + 3 + 2 + 1 = 15
        // i = 2 일 때 4 + 3 + 2 + 1 = 10
        // i = 3 일 때 3 + 2 + 1 = 6
        // i = 4 일 때 2 + 1 = 3
        // i = 5 일 때 1 = 1
        // 총 35 회
        
        //7 -> 35회, 6 -> 20회, 5 -> 10회, 4 -> 4회, 3 -> 1회
        long sum = 0;
        long num = 0;
        for(int i = 1; i <= N - 2; i++){
            num += i;
            sum += num;
        }

        bw.write(sum + "\n");
        bw.write(3 + "");

        br.close();
        bw.close();
    }

    // 디버깅용
    public static int MenOfPassion(int n) {
        int sum = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
