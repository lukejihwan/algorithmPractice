package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class Q9012 {
    static int T;
    static String[][] strArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        // 스택을 사용해 괄호를 하나씩 잘라 넣으면서, () 이렇게 구성이 되면, 둘다 제거해 버리고,
        // 만약 모두 넣었을 때 스택에 parenthesis가 존재하지 않으면 Yes, 아니면 No를 출력한다.

        for(int i = 0; i < T; i++){
            Stack<String> str = new Stack<String>();
            String line = br.readLine();
            System.out.println(line);
            for(int j = 0; j < line.length(); j++){
                strArr[i][j] = line.substring(j, j + 1);
                System.out.println(strArr[0][0]);
                if(strArr[i][j].equals(")") && str.peek().equals("(")){
                    str.pop();
                }else {
                    str.add(strArr[i][j]);
                }
            }

            if(str.empty() == true){
                bw.write("YES" + "\n");
            }else{
                bw.write("NO" + "\n");
            }
        }

        br.close();
        bw.close();

    }
}
