package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        /*
        * 1. 정수갯수 입력을 받는다.
        * 2. 정수를 공백을 기준으로 배열에 넣는다.
        * 3. 배열과 v를 비교하여 일치하는 것을 count한다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int intEa = Integer.parseInt(br.readLine());
        int[] numArray = new int[intEa];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numArray.length; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        int contrastNum = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] == contrastNum) count++;
        }

        bw.write(count + "\n");
        br.close();
        bw.close();
    }
}
