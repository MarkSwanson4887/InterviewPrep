import java.io.*; 

public class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;
		//This is the constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	//Using GeeksforGeeks printList function for the sake of practice
	 // Method to print the LinkedList. 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " \n"); 
            node = node.next; 
        } 
    } 

	void findDups(){
		//Finds all duplicates in a LinkedList
		Node ptr1 = null; Node ptr2 = null; Node dup = null;
		ptr1 = head;

		while(ptr1 != null && ptr1.next != null){
			ptr2 = ptr1;
			while(ptr2.next != null){
				if(ptr1.data == ptr2.next.data){
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}
				else{
					ptr2 = ptr2.next;
				}

			}
			ptr1 = ptr1.next;
		}
	}

	static int findMedian(LinkedList list){
		Node ptr1 = null; Node ptr2 = null; int evenMedian = 0;
		ptr1 = head;
		ptr2 = head;
		while(ptr1 != null && ptr2.next != null){
			if(ptr2.next.next == null){
				evenMedian = (ptr1.data + ptr1.next.data) / 2;
				return evenMedian;
			}
			else {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next.next;
			}
		}
		return ptr1.data;
	}

	static int findSize(LinkedList list){
		int count = 0;
		Node temp = null;
		temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	static void push(LinkedList list, int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
	}

	static LinkedList nthFrom(LinkedList list, int position){
		Node temp = null; LinkedList newList = new LinkedList();
		temp = head;
		while(position > 0){
			temp = temp.next;
			position = position - 1;
		}
		while(temp.next != null){
			push(newList, temp.data);
			temp = temp.next;
		}
		return newList;
	}



	public static void main(String[] args){
		System.out.println("Hello World");
		LinkedList list = new LinkedList();
		LinkedList testList = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(11);
		list.head.next.next = new Node(12);
		list.head.next.next.next = new Node(10);
		list.head.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next = new Node(11);

		push(testList, 2);
		push(testList, 3);
		System.out.println("Test List: \n");
		testList.printList(head);
		System.out.println("End of the Test List. \n");

		System.out.println("Linked List before removing duplicates : \n "); 
        list.printList(head);
        System.out.println(findSize(list) + " is the current size");
        System.out.println("The Median is under here: \n");
        System.out.println(findMedian(list)); 
        System.out.println("Here are the values from the 2nd index: \n");
        LinkedList nThList = nthFrom(list, 2);
        nThListprintList();
	}
}

