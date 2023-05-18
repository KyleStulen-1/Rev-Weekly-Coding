package problem_A_intersection;

public class Node {
	private int data;
	private Node next; 
	
	public Node(int data) {
		this.data = data; 
		this.next = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node nextNode) {
		this.next = nextNode;
	}
}
