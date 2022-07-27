package graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GraphTests {
    private Graph g;
    @BeforeEach
    public void setup() {
        g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        g.addEdge(0, 4);
        g.addEdge(4, 0);
        g.addEdge(4, 5);
        g.addEdge(5, 4);
        g.addEdge(1, 5);
        g.addEdge(5, 1);
        g.addEdge(5, 2);
        g.addEdge(2, 5);
        g.addEdge(1, 3);
        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(2, 3);
    }

    @Test
    public void testBFS() {
        g.BFS(0);
    }

    @Test
    public void testDFS() {
        g.DFS(0);
    }

    @Test
    public void testDFSRecursion() {
        g.DFSRecursion();
    }
}
