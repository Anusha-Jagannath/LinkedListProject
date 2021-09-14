package com.list;

public class SortedList {

	private Node head;

	class Node<T extends Comparable<T>> {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	/*
	 * method to sort the data while adding to linked list
	 */
	public <T extends Comparable<T>> void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null || head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.data.compareTo(data) < 0) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	/*
	 * method to print the data
	 */
	public void print() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

}
