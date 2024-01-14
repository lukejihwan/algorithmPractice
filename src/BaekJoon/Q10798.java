package BaekJoon;

import java.io.*;

public class Q10798 {
    public static void main(String[] args) throws IOException {
        //가장 긴줄의 길이를 가로 길이로 하여 배열을 선언한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = new String[5];
        int maxLength = 0;

        for(int i = 0; i < 5; i++){
            strArr[i] = br.readLine();
            maxLength = strArr[i].length() > maxLength ? strArr[i].length() : maxLength;
        }

        String[][] strMatrix = new String[5][maxLength];

        //배열에 입력값을 한줄씩 읽으면서 각 줄의 길이만큼 이중배열에 값을 넣는다.
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < strArr[i].length(); j++){
                strMatrix[i][j] = String.valueOf(strArr[i].charAt(j));
            }
        }

        StringBuilder sb = new StringBuilder();

        //이중배열이 완성되면 첫번째 글자부터 세로로 index를 바꿔가며 StringBuilder에 추가한다.
        for (int i = 0; i < maxLength; i++){
            for(int j = 0; j < 5; j++){
                if(strMatrix[j][i] != null){
                    sb.append(strMatrix[j][i]);
                }
            }
        }
        bw.write(sb.toString() + "\n");
        br.close();
        bw.close();
    }
}
