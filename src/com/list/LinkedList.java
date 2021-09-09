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
	 * @param data
	 */
	public boolean add(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			isAdded = true;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/*
	 * method to insert data at beginning
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * method to display linkedlist
	 */
	public void print() {
		Node temp = head;
		System.out.println("Linked list is");
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}
