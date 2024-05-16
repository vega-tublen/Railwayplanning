import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /*
         * N = Number of nodes, 2 ≤ N ≤ 1000
         * M = Number of edges, 1 ≤ M ≤ N(N−1)
         * C = Number of students traveling from node 0 to node N-1
         * P = number of routs in our plan, 0 ≤ P ≤ M
         * 
         * the capacity of the network before any routes are removed is at least C
         */

        int N = scan.nextInt();
        int M = scan.nextInt();
        int C = scan.nextInt();
        int P = scan.nextInt();
        scan.nextLine();

        List<Node> graph = new ArrayList<>();

        for (int i = 0; i < N; i ++) {
            graph.add(new Node(i));
        }

        for (int i = 0; i < N; i ++) {
            String[] uvc = scan.nextLine().split(" ");

            graph.get(Integer.parseInt(uvc[0])).addEdge(Integer.parseInt(uvc[2]), graph.get(Integer.parseInt(uvc[1])));
            graph.get(Integer.parseInt(uvc[1])).addEdge(Integer.parseInt(uvc[2]), graph.get(Integer.parseInt(uvc[0])));
        }


    }
}