package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int bracketEa = Integer.parseInt(st.nextToken());
        int putBallNum = Integer.parseInt(st.nextToken());
        int[] array = new int[bracketEa];

        for(int i = 0; i < putBallNum; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            for(int j = start; j <= end; j++){
                array[j-1] = number;
            }

        }

        for(int item : array){
            bw.write(item + " ");
        }
        br.close();
        bw.close();


    }
}
