package BaekJoon;

import java.io.*;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        //특징 : 1에서 n번째둘래와의 길이는 모두 같다.
        //고로, 몇번째 둘레냐만 구하면 최소 개수의 방을 구할 수 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        // 6, 12, 18, 24 number가 몇번째 둘레에 속하는지 구하면 된다.
        // number가 그 둘레의 최소수 a와 그 둘레의 최대수 b 사이에 있으면 출력한다.
        boolean flag = true;
        int perimeter = 1;

        int startNum = 1;
        int endNum = 1;
        int section = 6;

        while(flag){

            if(number >= startNum && number <= endNum){
                break;
            }

            startNum = endNum + 1;
            endNum = endNum + section;
            section = section + 6;
            perimeter++;
        }

        bw.write(perimeter + "\n");
        br.close();
        bw.close();

    }
}
