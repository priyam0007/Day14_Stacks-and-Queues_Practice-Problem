package com.blz.StackandQueueJava;

public class Queue {
	Node front;
	Node rear;

	int length;

	class Node {
		int key;
		Node next;

		public Node(int key) {

			this.key = key;
			this.next = null;
		}
	}

	// add data into the Queue
	public void enQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		} else {
			rear.next = new Node(data);
			rear = rear.next;
		}

		length++;

	}

	// Print method
	public void display() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.key + "-> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Stack and Queue Problem....!!!");
		Queue queue = new Queue();

		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.display();

	}

}
