package linkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		
	}
}
public class SwapListNodeInPair {
	
	
	
	public static Node swapPairs(Node head) {
		Node dummy=new Node(0);
		dummy.next=head;
		Node curr=dummy;
		while(curr.next!=null && curr.next.next!=null) {
			Node frist=curr.next;
			Node second=curr.next.next;
			frist.next=second.next;
			second.next=frist;
			curr.next=second;
			curr=frist;
		}
		
		return dummy.next;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1, 2, 3, 4};
	        Node list1 = createLinkedList(arr1);
	        System.out.println("Original list:");
	        printLinkedList(list1);

	        SwapListNodeInPair solution = new SwapListNodeInPair();
	        Node swappedList1 = solution.swapPairs(list1);
	        System.out.println("Swapped list:");
	        printLinkedList(swappedList1);

	}
	
	
	
	
	public static Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        return head;
    }

    // Helper function to print a linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    


//This code defines a ListNode class for linked list nodes and the Solution class that contains the swapPairs function. The createLinkedList function creates a linked list from an array, and the printLinkedList function prints a linked list. In the main method, an example linked list is created, and then the swapPairs function is called to swap adjacent nodes. Finally, both the original and swapped linked lists are printed for comparison.


}
