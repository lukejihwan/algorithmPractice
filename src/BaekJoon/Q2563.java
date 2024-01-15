package BaekJoon;

import java.io.*;
import java.util.ArrayList;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //색종이 갯수를 입력받는다.
        int count = Integer.parseInt(br.readLine());
        int total = 0;

        //도화지 크기가 100, 100이므로, 0부터 100까지의 면적을 boolean으로 false로 만든다.
        boolean[][] boolArr = new boolean[101][101];

        //for 문을 갯수만큼 돌면서, x와 y좌표를 추출하여 x부터 x+9까지, y부터 y+9까지 true로 만든다.
        for(int i = 0; i < count; i++){
            String[] strArr = br.readLine().split(" ");
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[1]);

            for(int j = x; j < x + 10; j++){
                for(int z = y;  z < y + 10; z++ ){
                    if(!boolArr[j][z]){
                        boolArr[j][z] = true;
                        total++;
                    }
                }
            }
        }

        //true의 갯수를 출력한다.
        bw.write(total + "\n");
        br.close();
        bw.close();
    }

}
