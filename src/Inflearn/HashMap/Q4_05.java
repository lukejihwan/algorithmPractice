package Inflearn.HashMap;

import java.util.*;

public class Q4_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        // 모든 숫자들을 다 더해서 ArrayList에 넣은 후 정렬하고, Set을 사용한다.
        int lt = 0, mt = 1, rt = 2;
        HashSet<Integer> hashSet = new HashSet<>();
        while (lt < N - 2 && rt < N){
            int sum = arr[lt] + arr[mt] + arr[rt];
            hashSet.add(sum);
            if(mt == N - 2) {
                lt++;
                mt = lt + 1;
                rt = mt + 1;
            }else if(rt == N - 1){
                mt++;
                rt = mt + 1;
            }else{
                rt++;
            }
        }

        Iterator iter = hashSet.iterator();
        int[] answer = new int[hashSet.size()];
        int index = 0;
        while (iter.hasNext()){
            answer[index] = (int)iter.next();
            index++;
        }

        Arrays.sort(answer);
        if(answer.length - K < 0){
            System.out.println(-1);
        }else{
            System.out.println(answer[answer.length - K]);
        }

    }
}
