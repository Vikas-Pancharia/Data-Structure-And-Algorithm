package stack;

public class StackByLinkedList {

	SingleLinkedList list;

	StackByLinkedList() {
		list = new SingleLinkedList();
	}

	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.push(value);
		}
	}

	public int peek() {
		if (!isEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The stack is empty!!");
			return -1;
		}
	}// end of method

	private boolean isEmpty() {
		return list.getHead() == null;
	}

	public int pop() {
		int value = -1;
		if(isEmpty()) {
			System.out.println("Stack underflow error!!");
		} else {
			value = list.getHead().getValue();
			list.pop();
		}
		return value;
	}

}
