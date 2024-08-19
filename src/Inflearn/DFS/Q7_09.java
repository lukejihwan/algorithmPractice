package Inflearn.DFS;

public class Q7_09 {
    Node root;
    public static void main(String[] args) {
        Q7_09 tree = new Q7_09();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));

    }

    // 만약 Node가 양쪽중 하나만 존재하는 상황이 있다면 이 문제는 DFS로 풀 수 없다.
    // 달리말하면 이러한 Tree 말단노드까지의 가장 짧은 경로를 푸는 문제는 BFS가 더 적합하다.
    private int DFS(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        }else{
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }
}
