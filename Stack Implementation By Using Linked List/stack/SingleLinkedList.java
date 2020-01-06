package stack;

public class SingleLinkedList {

	private SingleNode head;
	private int topOfStack = -1;

	public int getTopOfStack() {
		return topOfStack;
	}

	public void setTopOfStack(int topOfStack) {
		this.topOfStack = topOfStack;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void createSingleLinkedList(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(head);
		head = node;
		setTopOfStack(getTopOfStack() + 1);
	}

	public void push(int value) {
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(head);
		head = node;
		setTopOfStack(getTopOfStack() + 1);
	}

	public void pop() {
		head = head.getNext();
		setTopOfStack(getTopOfStack() - 1);
	}

}
