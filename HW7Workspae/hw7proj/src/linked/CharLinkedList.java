package linked;

import java.util.*;


public class CharLinkedList 
{
	private CharNode		head;	// Empty if head and
	private CharNode		tail;	// tail are null
	
	
	public CharLinkedList()		{ }
	
	
	public CharLinkedList(String s)
	{
		for (int i=s.length()-1; i>=0; i--)
			insertAtHead(s.charAt(i));
	}
	
	
	public void insertAtHead(char ch)
	{
		assert hasIntegrity();		// Precondition
		
		CharNode node = new CharNode(ch);
		node.setNext(head);
		head = node;
		if (tail == null)
			tail = node;			// Corner case: inserting into empty node
		
		assert hasIntegrity();		// Postcondition
	}
	
	
	public String toString()
	{
		String s = "";
		CharNode node = head;
		while (node != null)
		{
			s += node.getData();
			node = node.getNext();
		}
		return s;
	}
	
	
	//
	// Returns true if this list has emptiness integrity, has tail integrity, has no loops,  
	// and tail is reachable from head.
	//
	// Caution: this checks for most but not all common integrity problems. 
	//
	boolean hasIntegrity()
	{
		// Check emptiness. If either head or tail is null, the other must
		// also be null. Different logic from what you saw in lecture. Returns
		// immediately if this list is empty.
		if (head == null  ||  tail == null)
			return head == null  &&  tail == null;
		
		// Check tail integrity (tail.next must be null).
		if (tail.getNext() != null)
			return false;
		
		// Check for loops.
		Set<CharNode> visitedNodes = new HashSet<>();
		CharNode node = head;
		while (node != null)
		{
			if (visitedNodes.contains(node))
				return false;		// Current node has been visited before, we must have a loop
			visitedNodes.add(node); // First visit to this node
			node = node.getNext();
		}
		
		// Make sure tail is reachable from head.
		node = head;
		while (node != null && node != tail)
			node = node.getNext();
		return node == tail;
	}
	
	
	static void sop(Object x) 		{ System.out.println(x); }
	
	//Find and return a node with the given char data
	public CharNode find(char ch) {
		assert hasIntegrity();
		CharNode node = head;
		while (node != null) {
			if (node.getData() == ch) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	//Find a node with the given char data, duplicate it, and place it next to the found node
	public void duplicate(char ch) {
		assert hasIntegrity();
		CharNode foundNode = find(ch);
		if (foundNode != null) {
			CharNode nodeAfterFoundNode = foundNode.getNext();
			CharNode duplicateNode = new CharNode(foundNode.getData());
			foundNode.setNext(duplicateNode);
			duplicateNode.setNext(nodeAfterFoundNode);
			if (nodeAfterFoundNode == null)
				tail = duplicateNode;
		}
	}
}
