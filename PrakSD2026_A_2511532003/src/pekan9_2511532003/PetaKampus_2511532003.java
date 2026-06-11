package pekan9_2511532003;


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511532003 extends JFrame {

    // GRAPH
    private Map<String, java.util.List<String>> graph_2003 = new HashMap<>();

    // GUI COMPONENT
    private JComboBox<String> startBox_2003, goalBox_2003;
    private JTextArea outputArea_2003;
    private JPanel graphPanel_2003;

    // NODE POSISI (biar visual seperti gambar)
    private Map<String, JLabel> nodeLabel_2003 = new HashMap<>();

    public PetaKampus_2511532003() {
        setTitle("PENCARIAN JALUR BFS & DFS");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildGraph_2003();
        initGUI_2003();

        setVisible(true);
    }

    // ================= GRAPH =================
    private void buildGraph_2003() {

        addEdge_2003("Perpus", "FTI");
        addEdge_2003("Perpus", "Rektorat");
        addEdge_2003("Rektorat", "PKM");
        addEdge_2003("PKM", "Lab Jaringan");
        addEdge_2003("FTI", "Lab Jaringan");
        addEdge_2003("Rektorat", "Masjid");
        addEdge_2003("Masjid", "Labor AI");
        addEdge_2003("Lab Jaringan", "Labor AI");

        // tambahan node biar >= 10 node
        addEdge_2003("FTI", "Auditorium");
        addEdge_2003("PKM", "Parkiran");
        addEdge_2003("Masjid", "Kantin");
    }

    private void addEdge_2003(String a, String b) {
        graph_2003.putIfAbsent(a, new ArrayList<>());
        graph_2003.putIfAbsent(b, new ArrayList<>());

        graph_2003.get(a).add(b);
        graph_2003.get(b).add(a);
    }

    // ================= GUI =================
    private void initGUI_2003() {

        JPanel topPanel_2003 = new JPanel();

        startBox_2003 = new JComboBox<>(graph_2003.keySet().toArray(new String[0]));
        goalBox_2003 = new JComboBox<>(graph_2003.keySet().toArray(new String[0]));

        JButton bfsBtn_2003 = new JButton("BFS");
        JButton dfsBtn_2003 = new JButton("DFS");
        JButton resetBtn_2003 = new JButton("RESET");

        topPanel_2003.add(new JLabel("Start:"));
        topPanel_2003.add(startBox_2003);
        topPanel_2003.add(new JLabel("Goal:"));
        topPanel_2003.add(goalBox_2003);
        topPanel_2003.add(bfsBtn_2003);
        topPanel_2003.add(dfsBtn_2003);
        topPanel_2003.add(resetBtn_2003);

        add(topPanel_2003, BorderLayout.NORTH);

        // GRAPH VISUAL PANEL
        graphPanel_2003 = new JPanel();
        graphPanel_2003.setLayout(null);
        graphPanel_2003.setPreferredSize(new Dimension(600, 400));

        addNodesVisual_2003();

        add(graphPanel_2003, BorderLayout.CENTER);

        // OUTPUT
        outputArea_2003 = new JTextArea();
        add(new JScrollPane(outputArea_2003), BorderLayout.EAST);

        // ACTION
        bfsBtn_2003.addActionListener(e -> bfs_2003());
        dfsBtn_2003.addActionListener(e -> dfs_2003());
        resetBtn_2003.addActionListener(e -> reset_2003());
    }

    // ================= VISUAL NODE =================
    private void addNodesVisual_2003() {

        String[] nodes = graph_2003.keySet().toArray(new String[0]);

        int x = 50, y = 50;

        for (String node : nodes) {
            JLabel label = new JLabel(node);
            label.setOpaque(true);
            label.setBackground(Color.WHITE);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            label.setBounds(x, y, 100, 30);

            nodeLabel_2003.put(node, label);
            graphPanel_2003.add(label);

            x += 120;
            if (x > 500) {
                x = 50;
                y += 80;
            }
        }
    }

    // ================= BFS =================
    private void bfs_2003() {

        resetColor_2003();

        String start = (String) startBox_2003.getSelectedItem();
        String goal = (String) goalBox_2003.getSelectedItem();

        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {

            String node = q.poll();
            highlight_2003(node, Color.YELLOW);

            if (node.equals(goal)) break;

            for (String neigh : graph_2003.get(node)) {
                if (!visited.contains(neigh)) {
                    visited.add(neigh);
                    parent.put(neigh, node);
                    q.add(neigh);
                }
            }
        }

        showPath_2003(parent, start, goal, "BFS");
    }

    // ================= DFS =================
    private void dfs_2003() {

        resetColor_2003();

        String start = (String) startBox_2003.getSelectedItem();
        String goal = (String) goalBox_2003.getSelectedItem();

        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        dfsHelper_2003(start, goal, visited, parent);

        showPath_2003(parent, start, goal, "DFS");
    }

    private boolean dfsHelper_2003(String node, String goal,
                                   Set<String> visited,
                                   Map<String, String> parent) {

        visited.add(node);
        highlight_2003(node, Color.CYAN);

        if (node.equals(goal)) return true;

        for (String neigh : graph_2003.get(node)) {
            if (!visited.contains(neigh)) {
                parent.put(neigh, node);
                if (dfsHelper_2003(neigh, goal, visited, parent))
                    return true;
            }
        }
        return false;
    }

    // ================= PATH =================
    private void showPath_2003(Map<String, String> parent,
                               String start,
                               String goal,
                               String type) {

        java.util.List<String> path = new ArrayList<>();

        String cur = goal;
        while (cur != null) {
            path.add(cur);
            cur = parent.get(cur);
        }

        Collections.reverse(path);

        outputArea_2003.setText("");
        outputArea_2003.append("=== " + type + " RESULT ===\n");
        outputArea_2003.append("Path: " + path + "\n");
        outputArea_2003.append("Start: " + start + "\n");
        outputArea_2003.append("Goal: " + goal + "\n");
        outputArea_2003.append("Node dikunjungi: " + path.size() + "\n");

        // highlight path
        for (String n : path) {
            highlight_2003(n, Color.GREEN);
        }
    }

    // ================= COLOR =================
    private void highlight_2003(String node, Color c) {
        if (nodeLabel_2003.get(node) != null) {
            nodeLabel_2003.get(node).setBackground(c);
        }
    }

    private void resetColor_2003() {
        for (JLabel l : nodeLabel_2003.values()) {
            l.setBackground(Color.WHITE);
        }
    }

    private void reset_2003() {
        resetColor_2003();
        outputArea_2003.setText("");
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PetaKampus_2511532003::new);
    }
}