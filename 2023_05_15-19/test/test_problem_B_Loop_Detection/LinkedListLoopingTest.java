package test_problem_B_Loop_Detection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import problem_A_intersection.Node;
import problem_A_intersection.NodeListHelper;

public class LinkedListLoopingTest {
	
	@Test
	public void testIsLooping_loopingLists() {
		Node currentNode = null;
		Node startLoopNode = null;
		
		Node head1 = new Node(0);
		currentNode = head1;
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				startLoopNode = currentNode;
			}
			currentNode.setNext(new Node (i));
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(startLoopNode);

		assertEquals(startLoopNode, NodeListHelper.isLooping(head1));
	}
	
	@Test
	public void testIslooping_notLoopingLists() {
		Node currentNode = null;
		
		Node head1 = new Node(0);
		currentNode = head1;
		for (int i = 1; i < 10; i++) {
			currentNode.setNext(new Node (i));
			currentNode = currentNode.getNext();
		}
		
		assertNull(NodeListHelper.isLooping(head1));
	}

}
