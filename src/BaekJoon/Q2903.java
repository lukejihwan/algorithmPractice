package BaekJoon;

import java.io.*;

public class Q2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력값을 저장한다.
        int count = Integer.parseInt(br.readLine());
        int oneSidePointCount = 2;

        //입력값 만큼 반복을 한다.
        for(int i = 0; i < count; i++){
            //한변의 점의 갯수를 입력값 만큼 * 2 - 1 씩 계산한다.
            oneSidePointCount = oneSidePointCount * 2 - 1;
        }
        //변 * 변 으로 점의 총 갯수를 출력한다
        int result= oneSidePointCount * oneSidePointCount;

        bw.write(result + "\n");
        br.close();
        bw.close();

    }


}
