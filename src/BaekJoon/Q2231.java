package BaekJoon;

import java.io.*;

public class Q2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. 입력 받는다.
        //2. 1부터 입력받은 숫자까지 for loop을 돌면서 해당 숫자와 자릿수를 더해나간다.
        //3. 맨 처음 나오는 생성자를 출력한다.

        int Natural = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean flag = false;

        for(int i = 1; i <= Natural; i++){
            sum = 0;
            sum += i;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum == Natural){
                bw.write(i + "\n");
                flag = true;
                break;
            }
        }

        if(flag == false) bw.write(0 + "\n");

        br.close();
        bw.close();

    }
}
