package BaekJoon;

import java.io.*;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어의 갯수를 입력 받는다
        int repetition = Integer.parseInt(br.readLine());
        String[] strArr = new String[repetition];

        // 단어 갯수 만큼 단어를 입력 받는다.
        for(int i = 0; i < repetition; i++){
            strArr[i] = br.readLine();

            // 각 단어 별로 그룹 단어 인지 파악한다.
            for(int j = 0; j < strArr[i].length(); j++){
                char a = strArr[i].charAt(j);
                if()
            }

            /* 단어의 첫번째 char가 나머지 부분에 존재하는지 파악하고,
            존재한다면 return 한다.
            아니면, 두번째 char로 넘어가 나머지 부분에 존재하는지 파악한다.
            이 과정을 단어끝까지 반복한다. 통과시 그룹단어로 인정된다.
            * */
        }

        // 그룹 단어의 갯수를 출력한다.
    }
}
