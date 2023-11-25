package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        float max = 0;
        float sum = 0.453523535234523464236F;
        System.out.println(sum);

        for(int i = 0; i < a; i++){
            int number = Integer.parseInt(st.nextToken());
            max = max < number ? number : max;
            sum += number;
        }

        float result = (sum / (max * a)) * 100;

        bw.write(result + "\n");
        br.close();;
        bw.close();
    }
}
