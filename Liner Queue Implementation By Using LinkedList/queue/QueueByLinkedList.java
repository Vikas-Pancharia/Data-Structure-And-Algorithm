package queue;

import com.cg.linkedlist.linearqueue.linkedlist.SingleNode;

public class QueueByLinkedList {

	private SingleNode head;
	private SingleNode tail;

	public QueueByLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// To insert the element in the Queue
	public void enQueue(int nodeValue) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		System.out.println("Successfully inserted " + nodeValue + " in the queue");
		if (head == null) {
			head = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	// To get the head element
	public int peek() {
		if (!isQueueEmpty()) {
			return head.getValue();
		} else {
			System.out.println("Queue underflow error!!");
			return -1;
		}
	}

	// To check empty Queue
	private boolean isQueueEmpty() {
		return head == null;
	}

	// To remove the element from the queue
	public int deQueue() {
		SingleNode tempNode = head;
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
			return -1;
		} else {
			head = head.getNext();
			return tempNode.getValue();
		}
	}
}
