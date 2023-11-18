package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int bracketEa = Integer.parseInt(st.nextToken());
        int changeBalltimes = Integer.parseInt(st.nextToken());
        int[] array = new int[bracketEa];

        for(int i = 0; i < bracketEa; i++){
            array[i] = i + 1;
        }

        for(int i = 0; i < changeBalltimes; i++){
            st = new StringTokenizer(br.readLine());
            int firstBall = Integer.parseInt(st.nextToken());
            int secondBall = Integer.parseInt(st.nextToken());
            int temp = array[firstBall - 1];
            array[firstBall - 1] = array[secondBall - 1];
            array[secondBall - 1] = temp;
        }

        for(int item : array){
            bw.write(item + " ");
        }
        br.close();
        bw.close();
    }
}
