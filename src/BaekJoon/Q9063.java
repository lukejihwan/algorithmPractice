package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int widthMin = 0;
        int widthMax = 0;
        int heightMin = 0;
        int heightMax = 0;

        //x좌표의 최솟값과 최댓값의 차, y좌표의 최솟값과 최댓값의 차를 구하여 곱한다.
        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            if(i == 0){
                widthMin = width;
                widthMax = width;
                heightMin = height;
                heightMax = height;
            }

            widthMin = Math.min(width, widthMin);
            widthMax = Math.max(width, widthMax);
            heightMin = Math.min(height, heightMin);
            heightMax = Math.max(height, heightMax);

        }

        int x = widthMax - widthMin;
        int y = heightMax - heightMin;

        bw.write(x * y + "\n");
        br.close();
        bw.close();

    }
}
