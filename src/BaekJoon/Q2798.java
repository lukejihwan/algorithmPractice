package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardEa = Integer.parseInt(st.nextToken());
        int goalNum = Integer.parseInt(st.nextToken());
        int[] array = new int[cardEa];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cardEa; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        //오름차순 정렬
        Arrays.sort(array);

        //로직 goalNum의 수에서 가장큰수부터 뺀다.
        //그다음 작은수를 빼고, 맞지 않으면 다음 수로 넘어가는 식으로 goalNum번 반복한다.
        int count = 0;

        int index3 = array.length - 1;
        int index2 = array.length - 2;
        int index1 = array.length - 3;

        while(true) {
            int goal = goalNum - count;

            goal = goal - array[index3];
            goal = goal - array[index2];
            goal = goal - array[index1];

            //뺀수가 일치하면 무한루프를 멈춘다.
            if (goal == 0) {
                break;
            }

            if (goal > 0 && index1 < index2 && index2 < index3) {
                index2++;
            }else if(goal > 0 && (index3 - index2 == 1) ){
                count++;
            }else if(goal < 0 && index1 != 0){
                index1--;
            } else if (goal < 0 && index1 == 0 && index2 != 1) {
                index2--;
            } else if (goal < 0 && index1 == 0 && index2 == 1 && index3 != 2) {
                index3--;
            }
        }

        bw.write(goalNum - count + "\n");
        br.close();
        bw.close();

    }
}
