package com.list;

public class LinkedList {

	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	/*
	 * method to insert data at the end
	 * 
	 * @param data
	 */
	public boolean add(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	/*
	 * method to insert data at beginning
	 * 
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtPos(int pos, int data) {
		if (pos <= 0) {
			System.out.println("Invalid position");
			return;
		} else if (pos == 1) {
			push(data);
		} else {
			int count = 1;
			Node newNode = new Node(data);
			Node temp = head;
			Node cur = null;
			while (count < pos) {
				cur = temp;
				temp = temp.next;
				count++;
			}
			newNode.next = temp;
			cur.next = newNode;
		}

	}
	/*
	 * method to delete data from the head
	 */

	public void deleteAtHead() {
		Node temp = head;
		if (head == null) {
			System.out.println("Deletion not possible");
			return;
		} else if (head.next == null) {
			temp = null;

		} else {
			head = head.next;
			temp = null;
		}
	}
	/*
	 * method to delete node at the end
	 */

	public void deleteAtEnd() {
		Node temp = head;
		Node cur = temp;
		if (head == null) {
			System.out.println("Deletion not possible");
			return;
		} else if (head.next == null) {
			temp = null;

		} else {
			while (temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			cur.next = null;
		}
	}

	/*
	 * method to search key in Linked list
	 * 
	 * @param key
	 */
	public void searchList(int key) {
		if (head == null) {
			System.out.println("Search not possible..list is empty");
		} else {
			Node temp = head;
			int pos = 1;
			while (temp != null) {
				if (temp.data == key) {
					System.out.println("Key found at position " + pos);
					return;
				}
				temp = temp.next;
				pos = pos + 1;
			}
			System.out.println("key not found");
		}
	}

	/*
	 * method to insert the data after the key in Linked list
	 * 
	 * @param key and data
	 */
	public void insertAtKey(int key, int data) {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			while (temp != null) {
				if (temp.data == key) {
					newNode.next = temp.next;
					temp.next = newNode;
					return;
				}
				temp = temp.next;
			}
			System.out.println("key not found");
		}
	}

	/*
	 * method to delete specified data from the Linked list
	 * 
	 * @param key
	 */
	public void DeleteAtKey(int key) {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
		}

		else if (head.next == null) {
			if (head.data == key) {
				temp = null;
			}
		}

		else {
			int pos = 1;
			Node previous = temp;
			while (temp != null) {
				if (temp.data == key) {
					if (pos == 1) {
						deleteAtHead();
						return;
					} else {
						previous.next = temp.next;
						temp.next = null;
						return;
					}
				}
				previous = temp;
				temp = temp.next;
				pos = pos +1;
			}
			System.out.println("key not found");
		}
	}

	/*
	 * method to display linkedlist
	 */
	public void print() {
		Node temp = head;
		System.out.println("\nLinked list is");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
}
