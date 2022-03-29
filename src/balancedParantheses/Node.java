package balancedParantheses;

public class Node {
	
	String element;
	Node next;
	public Node(String element) {
		this.element = element;
		this.next = null;
		BalancedParentheses.size++;
	}
	
}