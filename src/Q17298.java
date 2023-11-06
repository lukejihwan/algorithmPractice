import java.io.*;
import java.util.Stack;

public class Q17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int[] A=new int[n]; //수열 배열 생성
        int[] answer=new int[n]; //정답 배열 생성

        String[] str=bf.readLine().split(" ");
        for(int i=0; i<n; i++){
            A[i]=Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack=new Stack<>();
        myStack.push(0); //처음에는 항상 스택이 비어있으므로 최초 값을 push해 초기화 왜??
        for(int i=1; i<n ; i++){ //왜 1부터 시작을 해주는 거지? A: 자기 자신보다 큰수를 두번째 인덱스부터 비교하기 때문에
            while(!myStack.isEmpty() && A[myStack.peek()] <A[i]){
                //왜 비어있지 않아야 한다가 조건이지?
                answer[myStack.pop()]=A[i]; //정답 배열에 오큰수를 배열에 저장하기
            }
            myStack.push(i);
        }
        while(!myStack.empty()){
            //반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때 까지, 즉 남은 수들은 모두 오큰수가 존재하지 않으므로 -1로 처리
            answer[myStack.pop()]=-1;
            //스택에 쌓인 index에 -1을 넣고
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //갑자기 얘는 왜 나오는 거야?

        for(int i=0; i<n; i++){
            bw.write(answer[i]+" ");
            //출력한다
        }
        bw.write("\n");
        bw.flush();

    }
}
