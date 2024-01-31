package BaekJoon;

import java.awt.image.BufferedImageFilter;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int startNum = Integer.parseInt(br.readLine());
        int endNum = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = startNum; i <= endNum; i++){
            boolean check = false;

            //1은 소수가 아니다
            if(i == 1) continue;

            for(int j = 1; j < i; j++){
                // 나머지 계산을 할 때 0이 나오는 것이 1개만 있어야함.
                if(i % j == 0 && j != 1){
                    check = true;
                }
            }

            if(check == false) list.add(i);
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        if(list.size() == 0){
            bw.write(-1 + "\n");
        }else{
            bw.write(sum + "\n");
            bw.write(list.get(0) + "\n");
        }
        br.close();
        bw.close();


    }
}
