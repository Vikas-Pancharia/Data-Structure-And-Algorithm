package sorting;

import java.util.ArrayList;

public class TopologicalSortMain {

	public static void main(String[] args) {

		// Initialize a Arraylist for storing all the graph nodes
		ArrayList<GraphNode> nodeList = new ArrayList<>();

		// create 10 nodes: v1-v10
		for (int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i));
		}

		// Constructor
		TopologicalSort graph = new TopologicalSort(nodeList);

		// add edges
		graph.addDirectedEdge(1, 2);
		graph.addDirectedEdge(1, 4);
		graph.addDirectedEdge(2, 3);
		graph.addDirectedEdge(2, 5);
		graph.addDirectedEdge(3, 6);
		graph.addDirectedEdge(3, 10);
		graph.addDirectedEdge(4, 7);
		graph.addDirectedEdge(5, 8);
		graph.addDirectedEdge(6, 9);
		graph.addDirectedEdge(7, 8);
		graph.addDirectedEdge(8, 9);
		graph.addDirectedEdge(9, 10);

		// topologicalSort from v1
		System.out.println("Printing Sorting from source: V1");
		graph.topologicalSort();
	}
}
