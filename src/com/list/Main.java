package com.list;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list program");
		LinkedList list = new LinkedList();
		list.add(70);
		list.add(30);
		list.add(56);
		list.print();
		list.insertAtPos(2, 40);
		list.print();
	}

}
