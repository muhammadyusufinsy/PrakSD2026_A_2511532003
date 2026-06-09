package pekan9_2511532003;


import java.util.*;

public class GraphTraversal_2511532003 {
    private Map<String, List<String>> graph_2003 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_2003(String node1_2003, String node2_2003) {
        graph_2003.putIfAbsent(node1_2003, new ArrayList<>());
        graph_2003.putIfAbsent(node2_2003, new ArrayList<>());
        graph_2003.get(node1_2003).add(node2_2003);
        graph_2003.get(node2_2003).add(node1_2003);
    }

    // Menampilkan graf awal
    public void printGraph_2003() {
        System.out.println("Graf Awal (Adjacency List) : ");
        for (String node_2003 : graph_2003.keySet()) {
            System.out.print(node_2003 + " -> ");
            List<String> neighbors_2003 = graph_2003.get(node_2003);
            System.out.println(String.join(",", neighbors_2003));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs_2003(String start_2003) {
        Set<String> visited_2003 = new HashSet<>();
        System.out.println("Penelusuran DFS : ");
        dfsHelper_2003(start_2003, visited_2003);
        System.out.println();
    }

    private void dfsHelper_2003(String current_2003, Set<String> visited_2003) {
        if (visited_2003.contains(current_2003))
            return;

        visited_2003.add(current_2003);
        System.out.print(current_2003 + " ");

        for (String neighbor_2003 : graph_2003.getOrDefault(current_2003, new ArrayList<>())) {
            dfsHelper_2003(neighbor_2003, visited_2003);
        }
    }

    // BFS
    private void bfs_2003(String start_2003) {
        Set<String> visited_2003 = new HashSet<>();
        Queue<String> queue_2003 = new LinkedList<>();

        queue_2003.add(start_2003);
        visited_2003.add(start_2003);

        System.out.println("Penelusuran BFS :");

        while (!queue_2003.isEmpty()) {
            String current_2003 = queue_2003.poll();
            System.out.print(current_2003 + " ");

            for (String neighbor_2003 : graph_2003.getOrDefault(current_2003, new ArrayList<>())) {
                if (!visited_2003.contains(neighbor_2003)) {
                    queue_2003.add(neighbor_2003);
                    visited_2003.add(neighbor_2003);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511532003 graph_2003 = new GraphTraversal_2511532003();

        // Contoh graf = A-B, A-C, B-D, B-E
        graph_2003.addEdge_2003("A", "B");
        graph_2003.addEdge_2003("A", "C");
        graph_2003.addEdge_2003("B", "D");
        graph_2003.addEdge_2003("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah : ");
        graph_2003.printGraph_2003();

        // Lakukan penelusuran
        graph_2003.dfs_2003("A");
        graph_2003.bfs_2003("A");
    }
}
