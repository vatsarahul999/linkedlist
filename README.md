# linkedlist


This Repository contains my checks on the linked list. Most of the code is java.There are certain operations that have made in C. These are inside the c folder.

# Definition

A linkedlist is structure that is composed to list nodes. A list node contains the some data as well as a pointer to the next node. In this repository we use the following defination of a node in c
```
struct node {
int data;
struct node *next;
} 

```


In java code, unless mentioned otherwise we definate a node as 
```
class Node{
	private int data;
	private Node next;

	public Node(int data){
	this.data = data;
	this.next = null;
	}

	public int getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setData(Node next){
		this.next = next;
	}
}
```


# Operations 

## Insert into a LinkedList

In this program we will insert an element into a linked list. The element inserted will be the last element of the linked list.

## Insert elements into LinkedList sorted

In this program we insert the element sorted into a linked list. The linked list will be sorted after the insert.

## Remove an element from a LinkedList

In this program, we remove the element from a linked list. 
