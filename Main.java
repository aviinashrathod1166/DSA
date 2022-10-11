package com.datastructres;

public class Main {

	public static void main(String[] args) {
		//add an element at 1st Node
		Node<Integer> intNode1 = new Node<>(100);
		System.out.println("Integer node 1: " + intNode1);

		Node<String> stringNode1 = new Node<>("Java");
		System.out.println("String node 1 :" + stringNode1);

		//add an element at 2nd Node
		Node<Integer> intNode2 = new Node<>(200);
		Node<String> stringNode2 = new Node<>("Python");

		intNode1.setNext(intNode2);
		stringNode1.setNext(stringNode2);

		System.out.println("\nInteger node 1(two linked nodes) :" + intNode1);
		System.out.println("\nString node 1(two linked nodes)" + stringNode1);

		//add an element at 3rd Node
		Node<Integer> intNode3 = new Node<>(300);
		Node<String> stringNode3 = new Node<>("JavaScript");

		intNode2.setNext(intNode3);
		stringNode2.setNext(stringNode3);

		System.out.println("\nInteger node 1(Three linked nodes) :" + intNode1);
		System.out.println("\nString node 1(Three linked nodes)" + stringNode1);

	}

}
