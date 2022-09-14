package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private int V; // no of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    Graph(int v) {
        int[] arr = new int[3];
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * create an edge between vertex v and w
     */
    void addEdge(int v, int w) {adj[v].add(w);}


    /**
     * BFS traversal from source s
     */
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (q.size() != 0) {
            s = q.poll();

            System.out.print(s + " ");

            Iterator<Integer> it = adj[s].iterator();
            while(it.hasNext()) {
                int neighbour = it.next();
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }


    /**
     * DFS traversal from source s
     */
    void DFS(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        visited[s] = true;
        stack.push(s);

        while (stack.size() != 0) {
            int current = stack.pop();

            System.out.print(current + " ");

            Iterator<Integer> it = adj[current].iterator();
            while(it.hasNext()) {
                int neighbour = it.next();
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    stack.push(neighbour);
                }
            }
        }
    }


    /**
     * DFS by recursion
     *
     * Approach:
     * The algorithm starts at the root node (selecting some arbitrary node as the root
     * node in the case of a graph) and explores as far as possible along each branch
     * before backtracking. So the basic idea is to start from the root
     * or any arbitrary node and mark the node and move to the adjacent unmarked node and
     * continue this loop until there is no unmarked adjacent node.
     * Then backtrack and check for other unmarked nodes and traverse them.
     * Finally, print the nodes in the path.
     *
     * Algorithm:
     * Create a recursive function that takes the index of the node and a visited array.
     *
     * Mark the current node as visited and print the node.
     * Traverse all the adjacent and unmarked nodes and call the recursive
     * function with the index of the adjacent node.
     */
    void DFSRecursion() {
        boolean visited[] = new boolean[V];

        for (int i=0; i<V ; i++) {
            if (!visited[i]) {
                DFSRecursionUtil(i, visited);
            }
        }
    }
    private void DFSRecursionUtil(int current, boolean visited[]) {
        visited[current] = true;
        System.out.println(current + " ");

        Iterator<Integer> it = adj[current].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                DFSRecursionUtil(n, visited);
            }
        }

    }
}
