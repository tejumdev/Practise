package practise;

/* 
 Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 Return the decimal value of the number in the linked list.
 */
public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){data=d;}
	}
	
	
	static LinkedList add(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		
		if(list.head == null) list.head = newNode;
		else 
			{
			Node temp = list.head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
//			head.next = newNode;
			}
		return list;
	}
	
	static int binaryToDecimal(Node node){
		int num=0;
		while(node != null)
		{
			num = num *2 + node.data;
			node = node.next;
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
	    list = list.add(list,1);
	    list = list.add(list,0);
	    list = list.add(list,0);
	    list = list.add(list,1);
//	    list = list.add(list,0);
	  
	    	System.out.println(binaryToDecimal(list.head));
	   
	}

}
