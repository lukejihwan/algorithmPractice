package BaekJoon;

import java.io.*;

public class Q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1, 2, 3, 4, 5

        //입력값을 저장한다.
        int inputNum = Integer.parseInt(br.readLine());

        //입력값이 위의 범위에서 몇번째에 위치하는지 찾고,
        //해당 구간 첫번째 숫자로부터 몇번째 위치에 있는지 찾아 a/b에서 a자리를 찾았으면,
        //b자리는 해당 구간의 마지막끝 숫자에서 몇번째 자리인지를 찾으면, a와 b를 구할 수 있다.

        int startNum = 1;
        int endNum = 1;
        int section = 0;

        while(true){

            if(inputNum >= startNum && inputNum <= endNum){
                break;
            }

            section++;
            startNum = 1 + endNum;
            endNum = startNum + section;

        }

        int countFromStart = inputNum - startNum;
        int countFromEnd = endNum - inputNum;

        int a = 0;
        int b = 0;

        if(section % 2 == 1){
            a = countFromStart + 1;
            b = countFromEnd + 1;
        }else{
            a = countFromEnd + 1;
            b = countFromStart + 1;
        }

        bw.write(a + "/" + b);
        br.close();
        bw.close();

    }
}
