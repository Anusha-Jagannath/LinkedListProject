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
	
	public void insertAtPos(int pos,int data) {
		if(pos <= 0) {
			System.out.println("Invalid position");
			return;
		}
		else if(pos==1) {
			push(data);
		}
		else
		{
			int count = 1;
			Node newNode = new Node(data);
			Node temp = head;
			Node cur = null;
			while(count<pos) {
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
		if(head == null) {
			System.out.println("Deletion not possible");
			return;
		}
		else if(head.next == null) {
			temp = null;
			
		}
		else
		{
			head = head.next;
			temp = null;
		}
	}
	
	public void deleteAtEnd() {
		Node temp = head;
		Node cur = temp;
		if(head == null) {
			System.out.println("Deletion not possible");
			return;
		}
		else if(head.next == null) {
			temp = null;
			
		}
		else
		{
			while(temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			cur.next = null;
		}
	}
	
	
	
	/*
	 * method to display linkedlist
	 */
	public void print() {
		Node temp = head;
		System.out.println("\nLinked list is");
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}
