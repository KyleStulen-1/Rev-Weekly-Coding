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
}
