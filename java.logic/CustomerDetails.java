package group1.logic;
import java.util.Scanner;

//Linked List used 
public class CustomerDetails {
	Scanner inp = new Scanner(System.in);
	Node head;
	class Node{
		long phoneNo;
	    int tableNo;
	    int customerCapacity;
	    Node next;
		public Node(long phoneNo, int customerCapacity) {
			super();
			this.phoneNo = phoneNo;
			this.customerCapacity = customerCapacity;
			this.next = null;
		}
		public int getCustomerCapacity() {
			return customerCapacity;
		}
		
	}
		
	
	
	public CustomerDetails addANode(CustomerDetails List, long phoneNo, int customerCapacity){
		Node curr_node = null ;
		int tableNo = 0;
		Node new_node = new Node(phoneNo,  customerCapacity);
		new_node.next = null;
		if(List.head == null) {
			List.head = new_node;
		}
		else {
			curr_node = List.head;
			while(curr_node.next != null) {
				curr_node = curr_node.next;
			}
			curr_node.next = new_node;
		}
		System.out.println("-----------CUSTOMER HISTORY------------- ");
		
		curr_node = List.head;
		while(curr_node != null) {
			System.out.println( "Phone No: "+curr_node.phoneNo);
			//System.out.println(curr_node.tableNo+ "\t");
			System.out.println( "Capacity: "+curr_node.customerCapacity);
			curr_node = curr_node.next;
		}
		System.out.println("---------------------------------------- ");
		return List;
	}
	
	public CustomerDetails DeleteANode(CustomerDetails List, int tableNo) {
		Scanner s1 = new Scanner(System.in);
		Node curr_node;
		Node temp;
		int key = 0;
		if(List.head == null) {
			System.out.println("List is empty!!");
		}
		else {
			System.out.println("Enter the table No. to be deleted:");
			key = s1.nextInt();
			if(key == List.head.tableNo && List.head.next == null) {
				System.out.println("List has only one element!");
				List.head = null;
				System.out.println("Thank You So Much for visiting! Please visit again :)");
			}
			else if(key == List.head.tableNo && List.head.next != null) {
				temp = List.head;
				List.head = temp.next;
				temp = null;
			}
			else {
				curr_node = List.head;
				while(curr_node.next != null && key != curr_node.next.tableNo) {
					curr_node = curr_node.next;
				}
				temp = curr_node.next;
				if(temp.next == null) {
					curr_node.next = null;
				}
				else {
					curr_node.next = temp.next;
					temp.next = null;
					temp = null;
				}
			}
		}
		
		return List;
	}
	

}
