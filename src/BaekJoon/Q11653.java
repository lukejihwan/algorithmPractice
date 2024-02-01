package BaekJoon;

import java.io.*;
import java.util.ArrayList;

public class Q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N != 1){
            ArrayList<Integer> list = new ArrayList<>();
            int divideNum = 2; //2부터 소수이다.

            //구한 소수를 작은 수부터 나누어 나누어 떨어지면 출력한다
            while(divideNum <= N){
                if(N % divideNum == 0){
                    N = N / divideNum;
                    bw.write(divideNum + "\n");
                }else{
                    divideNum++;
                }
            }

            br.close();
            bw.close();
        }
    }
}
