import java.util.*;

public class Main {
    
    public static void main(String[] args){
    	Node head = new Node(10);
    	head.next = new Node(20);
    	head.next.next = new Node(30);
    	head.next.next.next = new Node(40);
    
		System.out.println("\ninitial linked list:");
    	int size = Node.length(head);
    	System.out.println("Size: " + size);
    	
    	Node.traverseLinkedList(head);
    	
    	Node target = head.next;
    	boolean nodeExists = Node.search(head, target.data);
    	System.out.println("\nNode: " + target.data 
    		+ " exists? " + nodeExists);
    		  
    	head = Node.insertAtFront(head, 5);
    	System.out.println("\ninsert at the front: 5");
		Node.traverseLinkedList(head);
    
    	head = Node.insertAt(head, 3, 35);
    	System.out.println("\ninsert in the middle: 35");
		Node.traverseLinkedList(head);
    
    	Node.append(head, 50);
    	System.out.println("\ninsert at the end: 50");
		Node.traverseLinkedList(head);
    	
    	head = Node.deleteTail(head);
    	System.out.println("\ndelete at the end: 50");
		Node.traverseLinkedList(head);
    	
    	head = Node.deleteAt(head, 3);
		System.out.println("\ndelete from the middle: 35");
    	Node.traverseLinkedList(head);
    
    	head = Node.deleteHead(head);
    	System.out.println("\ndelete at the front: 5");
		Node.traverseLinkedList(head);
    }
}
