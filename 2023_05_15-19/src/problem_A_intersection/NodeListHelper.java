package problem_A_intersection;

public class NodeListHelper {
	public static boolean isIntersecting(Node listOneHead, Node listTwoHead) {
		Node listOneCurrent = listOneHead;
		while (listOneCurrent != null) {
			Node listTwoCurrent = listTwoHead;
			while (listTwoCurrent != null) {
				if (listOneCurrent == listTwoCurrent) {
					return true;
				} else {
					listTwoCurrent = listTwoCurrent.getNext();
				}
			}
			listOneCurrent = listOneCurrent.getNext();
		}
		
		return false; 
	}
	
	//https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare
	public static Node isLooping(Node listHead) {
		if (listHead == null || listHead.getNext() == null) {
			return null; 
		}
		Node tortoise = listHead;
		Node hare = listHead; 
		
		tortoise = tortoise.getNext(); 
		hare = hare.getNext().getNext(); 
		
		while (hare != null && hare.getNext() != null) {
			if (tortoise == hare) {
				break;
			}
			tortoise = tortoise.getNext();
			hare = hare.getNext().getNext();
		}
		
		if (tortoise != hare) {
			return null; 
		}
		
		tortoise = listHead; 
		while (tortoise != hare) {
			tortoise = tortoise.getNext();
			hare = hare.getNext();
		}
		
		return tortoise;
	}
}
