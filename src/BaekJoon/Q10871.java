package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int numbers = Integer.parseInt(st.nextToken());
        int standardNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numbers; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < standardNum) bw.write(num + " ");
        }
        br.close();
        bw.close();

    }

}
