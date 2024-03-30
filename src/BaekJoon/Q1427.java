package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split("");

        Arrays.sort(strArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++){
            sb.append(strArr[i]);
        }

        bw.write(sb.toString() + "\n");

        br.close();
        bw.close();
    }
}
