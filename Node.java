import java.util.*;

public class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public static void traverseLinkedList(Node head){
    	Node curr = head;
		while(curr != null){
    		System.out.print(curr.data + " " );
    		
    		curr = curr.next;
    	}
    	System.out.println();
    }
    
    public static boolean search(Node head, int key){
    	Node curr = head;
    	
    	while(curr != null){
    		if(curr.data == key){
    			return true;
    		}
    	
    		curr = curr.next;
    	}
    	
    	return false;
    }
    
    public static int length(Node head){
    	Node curr = head;
    	int length = 0;
    	while(curr != null){
    		length++;
    		curr = curr.next;
    	}
    	return length;
    }
    
	//insert at front
	public static Node insertAtFront(Node head, int data){
		Node node = new Node(data);
		
		//point to the current head
		node.next = head;
		
		return node;
	}
	
	//insert at end
	public static Node append(Node head, int data){
		Node node = new Node(data);
		
		//if empty then new node is the head
		if(head == null){
			return node;
		}
		
		//store the head as a temp
		Node temp = head;
		
		//move to the last node
		while(temp.next != null){
			temp = temp.next;
		}
		
		//change the pointer of the last node
		temp.next = node;
		
		return head;
	}
	
	//insert at desired position (middle)
	public static Node insertAt(Node head, int pos, int data){
		Node node;
		if(pos < 1){
			return head;
		}
		
		//move head if at pos 1
		if(pos == 1){
			node = new Node(data);
			node.next = head;
			return node;
		}
		
		Node curr = head;
		for( int i = 1; i < pos - 1 && curr != null; i++ ){
			curr = curr.next;
		}
		
		//pos is greater than number of elements
		if(curr == null){
			System.out.println(pos + " out of bounds...");
			return head;
		}
		
		node = new Node(data);
		
		//update pointers
		node.next = curr.next;
		curr.next = node;
		
		return head;
	}
    
    public static Node deleteHead(Node head){
	//check if empty
	if(head == null){
		return null;
	}
	
	//store the head in a temp
	Node temp = head;
	
	//move pointer to the next
	head = head.next;
	
	//remove the referece (garbage collector will take care of rest)
	temp = null;
	
	return head;
    }
    
    public static Node deleteTail(Node head){
    	if(head == null){
    		return null;
    	}
    	
    	if(head.next == null){
    		return null;
    	}
    	
    	//create temp to find second to last
    	Node temp = head;
    	
    	//move to the last position
    	while(temp.next.next != null){
    		temp = temp.next;
    	}
    	
    	//remove
    	temp.next = null;
    	
    	return head;
    }
    
    public static Node deleteAt(Node head, int pos){
    	Node temp = head;
    	Node prev = null;
    	
    	//if empty do nothing
    	if(temp == null){
    		return head;
    	}
    	
    	//delete head
    	if(pos == 1){
    		head = temp.next;
    		return head;
    	}
    	
    	//traverse until given position
    	for(int i = 1; temp != null && i < pos; i++){
    		prev = temp;
    		temp = temp.next;
    	}
    	
    	//if pos found, then delete
    	if(temp != null){
    		prev.next = temp.next;
    	}
    	else{
    		System.out.println("no data found...");
    	}
    	
    	return head;
    	
    }
}