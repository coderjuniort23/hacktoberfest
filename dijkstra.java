import java.util.*;

public class DijkstraAlgorithm {

    static class Node {
        int index;
        int distance;

        Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    public static int[] dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        priorityQueue.offer(new Node(source, 0));

        while (!priorityQueue.isEmpty()) {
            Node current = priorityQueue.poll();
            for (int i = 0; i < n; i++) {
                if (graph[current.index][i] != 0) {
                    int distance = current.distance + graph[current.index][i];
                    if (distance < distances[i]) {
                        distances[i] = distance;
                        priorityQueue.offer(new Node(i, distance));
                    }
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the graph: ");
        int nodes = scanner.nextInt();
        int[][] graph = new int[nodes][nodes];

        for (int i = 0; i < nodes; i++) {
            System.out.print("Enter the number of edges for node " + (i + 1) + ": ");
            int edges = scanner.nextInt();
            for (int j = 0; j < edges; j++) {
                System.out.print("Enter the neighbor and weight for edge " + (j + 1) + " (format: neighbor weight): ");
                int neighbor = scanner.nextInt();
                int weight = scanner.nextInt();
                graph[i][neighbor] = weight;
            }
        }

        System.out.print("Enter the source node: ");
        int sourceNode = scanner.nextInt();
        int[] result = dijkstra(graph, sourceNode);
        System.out.print("Shortest distances from source node " + sourceNode + ": ");
        for (int distance : result) {
            System.out.print(distance + " ");
        }
    }
}
