import java.util.*;

public class insertSort {


	static class Node {
		private int data;
		private Node next;
		
		public Node(){}
		public Node (int data){
			this.data=data;
			next = null;
		}
		public void setData(int data){
			this.data = data;
		}
		
		public int getData(){
			return this.data;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
		public Node getNext(){
			return this.next;
		}
	}

	public static void printList(Node head){
		Node temp = head;
		System.out.println("The Linked List is :");
		while(temp!=null){
			System.out.print(temp.getData()+ "\t");
			temp = temp.getNext();
		} 
		System.out.println();

	}

	public static Node insert_sorted(Node head, int data){
		Node newNode = new Node(data);
		if(head == null){
			return  newNode;
		}
		Node temp = head, temp_1 = null;
		while(temp != null && temp.getData() <= data){
		  temp_1 = temp;
		  temp = temp.getNext();
		}
		//The element to be inserted is the min element in the list.
		if(temp_1 == null){
			newNode.setNext(temp);
			head = newNode;
			return head;
		}
		//The element is not the max element in the list.
		if(temp != null){	
			temp_1.setNext(newNode);
			newNode.setNext(temp);
		} else {
		//The element is the max element in the list.
			temp_1.setNext(newNode);
		}
		
		return head;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int ch = 0,data = 0;
		Node head = null;
		do{
			System.out.println("Enter the element that you want to insert_sorted into a Linked List: ");
			data = sc.nextInt();
			head = insert_sorted(head,data);
			printList(head);
			System.out.println("Press 1 to exit. Press any other key to continue....");
			ch =  sc.nextInt();
		}while(ch!=1);
	}



}
