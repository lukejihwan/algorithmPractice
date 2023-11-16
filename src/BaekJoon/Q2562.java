package BaekJoon;

import java.io.*;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        // 9개의 수에서 가장 큰수를 찾고

        // 가장 큰수가 몇번째 index에 존재하는지 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[9];
        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
            max = array[i] > max ? array[i] : max;
        }

        for(int i = 0; i < 9; i++){
            if(array[i] == max) index = i+1;
        }

        bw.write(max + "\n" + index);
        br.close();
        bw.close();

    }
}
