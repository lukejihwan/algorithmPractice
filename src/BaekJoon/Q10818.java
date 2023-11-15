package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repetitionNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 0;
        int max = 0;
        int standard = 0;

        for(int i = 0; i < repetitionNum; i++){
            if(i != 0){
                standard = Integer.parseInt(st.nextToken());
                min = (min > standard) ? standard : min;
                max = (max < standard) ? standard : max;
            }else if(i == 0){
                min = Integer.parseInt(st.nextToken());
                max = min;
            }
        }
        bw.write(min + " " + max);
        br.close();
        bw.close();

    }
}
