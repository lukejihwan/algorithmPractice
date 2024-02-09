package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q14215 {
    public static void main(String[] args) throws IOException {

        //삼각형이 되는 조건 : 가장 작은 두변의 길이의 합이 나머지 변의 길이보다 커야함

        //로직 : 1. 가장 작은 두 변의 길이의 합을 구함
        //2. 나머지 한변의 길이가 두 합의 길이보다 크면 두 합의 길이 -1 까지 자르고
        //3. 두 변의 합보다 작으면 그냥 둔다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int max = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int side = Integer.parseInt(st.nextToken());
            if(side > max){
                max = side;
            }
            sum += side;

            arr[i] = side;
        }

        int sumOfTwoSide = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                sumOfTwoSide = sum - max;
            }
        }

        if(sumOfTwoSide <= max){
            max = sumOfTwoSide - 1;
            bw.write(max + sumOfTwoSide + "\n");
        }else{
            bw.write(sum + "\n");
        }

        br.close();
        bw.close();


    }
}
