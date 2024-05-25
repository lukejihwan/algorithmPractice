package Inflearn.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        // 큐를 사용해 구현한다.
        // 큐에 1부터 N까지 담는다.
        // K 전까지 큐 front에서 제거하고 뒤쪽으로 넣는다.
        // 그리고, K번째 는 삭제한다.
        // 하나가 남을 때까지 반복한다.

        Queue<Integer> queue = new LinkedList<>(); // Queue종류에 대해 파악하기
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            for(int i = 0; i < K - 1; i++) queue.add(queue.poll());
            queue.poll();
        }

        System.out.println(queue.poll());
        return ;
    }
    }
}
