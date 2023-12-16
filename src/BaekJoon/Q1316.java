package BaekJoon;

import java.io.*;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어의 갯수를 입력 받는다
        int repetition = Integer.parseInt(br.readLine());
        String[] strArr = new String[repetition];
        boolean flag = true;
        int count = 0;

        // 단어 갯수 만큼 단어를 입력 받는다.
        for(int i = 0; i < repetition; i++){
            flag = true;
            strArr[i] = br.readLine();

            // 각 단어 별로 그룹 단어 인지 파악한다.
            for(int j = 0; j < strArr[i].length(); j++){
                char a = strArr[i].charAt(j);
                int lastIndex = strArr[i].lastIndexOf(a);

                for(int t = j; t <= lastIndex; t++){
                    if(strArr[i].charAt(t) != a){
                        flag = false;
                    }
                }
            }

            if(flag){
                count++;
            }
        }

        bw.write(count + "\n");
        br.close();
        bw.close();

    }
}
