package BaekJoon;

import java.io.*;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] matrix = new int[9][9];
        int maxNum = 0;
        int row = 0;
        int column = 0;

        //이차배열에 입력 값들을 받는다.
        for(int i = 0; i < 9; i++){
            String[] strArr = br.readLine().split(" ");
            for(int j = 0; j < 9; j++){
                matrix[i][j] = Integer.parseInt(strArr[j]);
                //이차배열을 이중 for문으로 비교하면서 가장 큰 값의 index를 다른 두 변수에 저장
                //하고, 가장 큰 수도 변수에 저장한다.
                if(matrix[i][j] >= maxNum){
                    maxNum = matrix[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        //가장큰 수를 첫번째 줄에 출력하고
        //가장큰 수의 index를 띄어쓰기를 사이에 두고 출력한다.
        bw.write(maxNum + "\n" + row + " " + column + "\n");
        br.close();
        bw.close();
    }
}
