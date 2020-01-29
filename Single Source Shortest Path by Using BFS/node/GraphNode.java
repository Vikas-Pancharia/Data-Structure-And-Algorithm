package node;

import java.util.*;

public class GraphNode {
	
	private String name;
	private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
	private boolean isVisited = false;
	private GraphNode parent;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public GraphNode getParent() {
		return parent;
	}

	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	public GraphNode(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  name ;
	}

}
