package BaekJoon;

import java.io.*;
import java.util.Stack;

public class Q9012 {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        // 스택을 사용해 괄호를 하나씩 잘라 넣으면서, () 이렇게 구성이 되면, 둘다 제거해 버리고,
        // 만약 모두 넣었을 때 스택에 parenthesis가 존재하지 않으면 Yes, 아니면 No를 출력한다.

        for(int i = 0; i < T; i++){
            Stack<String> str = new Stack<String>();
            String line = br.readLine();
            for(int j = 0; j < line.length(); j++){
                if(line.substring(j, j + 1).equals(")") && !str.empty() && str.peek().equals("(")){
                    str.pop();
                }else {
                    str.add(line.substring(j, j + 1));
                }
            }

            if(str.empty()){
                bw.write("YES" + "\n");
            }else{
                bw.write("NO" + "\n");
            }
        }

        br.close();
        bw.close();

    }
}
