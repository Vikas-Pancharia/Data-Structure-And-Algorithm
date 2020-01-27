package node;

import java.util.*;

public class GraphNode {
	private String name;
	private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
	private boolean isVisited = false;
	
	public GraphNode(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
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

	@Override
	public String toString() {
		return  name ;
	}

}
