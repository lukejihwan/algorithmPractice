package BaekJoon;

import java.io.*;

public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 3 -> 1, 1, 1 = 1
        // 4 -> 2, 2!, 2! = 4 + 1 = 5
        // 5 -> 3, 3!, 3! = 9 + 4 + 1 = 14
        // 6 -> = 16 + 9 + 4 + 1 = 30
        // 7 -> 5, 5, 5 = 25 + 16
        long rep = N * 5;
        //bw.write(rep + "\n");
        //bw.write(3 + "");

        int num = MenOfPassion(7);
        System.out.println(num);

        br.close();
        bw.close();
    }

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
