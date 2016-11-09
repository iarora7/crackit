package main.java.linkedList;

	//Java program to remove duplicates from a sorted linked list
	class LinkedList {
		 Node head;  // head of list
		
		 /* Linked list Node*/
		 class Node
		 {
		     int data;
		     Node next;
		     Node(int d) {data = d; next = null; }
		 }
		
		 void removeDuplicates()
		 {
		     /*Another reference to head*/
		     Node current = head;
		
		     /* Pointer to store the next pointer of a node to be deleted*/
		     Node runner;
		
		     /* do nothing if the list is empty */
		     if (head == null)    
		         return;
		
		     /* Traverse list till the last node */
		     while (current.next != null) {
		    	 runner = current;
		    	 while(runner.next != null){
		    		 /*Compare current node with the next node */
			         if (current.data == runner.next.data) {
//			             System.out.println("Deleting: " + runner.next.data);
			        	 runner.next = runner.next.next;
			         }
			         else // advance if no deletion
			            runner = runner.next;
			     }
		    	 current = current.next;
		    }
		         
		 }
		                  
		 /* Utility functions */
		
		 /* Inserts a new Node at front of the list. */
		 public void push(int new_data)
		 {
		     /* 1 & 2: Allocate the Node &
		               Put in the data*/
		     Node new_node = new Node(new_data);
		
		     /* 3. Make next of new Node as head */
		     new_node.next = head;
		
		     /* 4. Move the head to point to new Node */
		     head = new_node;
		 }
		
		 /* Function to print linked list */
		  void printList()
		  {
		      Node temp = head;
		      while (temp != null)
		      {
		         System.out.print(temp.data+" ");
		         temp = temp.next;
		      }  
		      System.out.println();
		  }
		
		  /* Drier program to test above functions */
		 public static void main(String args[])
		 {
		     LinkedList llist = new LinkedList();
		     llist.push(11);
		     llist.push(11);
		     llist.push(12);
		     llist.push(13);
		     llist.push(11);
		     llist.push(11);
		     llist.push(11);
		     llist.push(14);
		     llist.push(11);
		     llist.push(11);
		     llist.push(11);
		     llist.push(12);
		      
		     System.out.println("List before removal of duplicates");
		     llist.printList();
		      
		     llist.removeDuplicates();
		      
		     System.out.println("List after removal of elements");
		     llist.printList();
		     
		     System.out.println("List after reversing remaining elements");
		     llist.reverseList();
		     llist.printList();
		 }

		private void reverseList() {
			Node next, prev=null;
			while(head != null) {
				next = head.next;
				head.next = prev;
				prev = head;
				head = next;
			}
			head = prev;
		}
} 
