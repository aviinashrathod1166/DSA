package com.datastructres;

import java.time.Duration;
import java.time.Instant;

public class LinkedListTest {

	private static void insert100000ElementsAtHead(LinkedList<Integer> listHead) {
		for (int i = 0; i < 100000; i++) {
			listHead.insertAtHead(i);
		}
	}

	private static void insert100000ElementsAtTail(LinkedList<Integer> listTail) {
		for (int i = 0; i < 100000; i++) {
			listTail.insertAtTail(i);
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println("********Insert at Head node*********");
		linkedList.insertAtHead(100);
		System.out.println("LinkedList (1 node) :" + linkedList);

		linkedList.insertAtHead(200);
		System.out.println("LinkedList (2 node) :" + linkedList);

		linkedList.insertAtHead(300);
		linkedList.insertAtHead(400);
		linkedList.insertAtHead(500);
		System.out.println("LinkedList (5 node) :" + linkedList);

		System.out.println("********Count the Nodes*********");
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		System.out.println("LinkedList node count(Empty) :" + linkedList1.countNodes());

		linkedList1.insertAtHead(100);
		linkedList1.insertAtHead(200);
		linkedList1.insertAtHead(300);
		linkedList1.insertAtHead(400);
		linkedList1.insertAtHead(500);
		System.out.println("LinkedList node count :" + linkedList1.countNodes());

		System.out.println("********Insert at Tail node*********");
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		linkedList2.insertAtTail(600);
		linkedList2.insertAtTail(700);
		System.out.println("LinkedList node count :" + linkedList2.countNodes());
		linkedList2.insertAtTail(800);
		linkedList2.insertAtTail(900);
		linkedList2.insertAtTail(1000);
		System.out.println("LinkedList inserted at Tail node) :" + linkedList2);
		System.out.println("LinkedList node count :" + linkedList2.countNodes());

		// ***********Insert element at Head*******
		System.out.println("*Insert element at Head*");
		LinkedList<Integer> listTimedurationForHead = new LinkedList<>();
		Instant start = Instant.now();
		insert100000ElementsAtHead(listTimedurationForHead);
		Instant end = Instant.now();
		System.out.println("\nTime taken to insert 100000 elements at head: " + Duration.between(start, end));

		// *************Insert element at Tail********
		System.out.println("*Insert element at Tail*");
		LinkedList<Integer> listTimedurationForTail = new LinkedList<>();
		Instant start1 = Instant.now();
		insert100000ElementsAtHead(listTimedurationForTail);
		Instant end1 = Instant.now();
		System.out.println("\nTime taken to insert 100000 elements at Tail: " + Duration.between(start1, end1));

		// Insertion of node at specific Location
		System.out.println("Insertion of node at specific Location");
		LinkedList<Integer> listIndex = new LinkedList<Integer>();
		listIndex.insert(100, 0);
		System.out.println("At 0th Index: " + listIndex);
		listIndex.insert(99, -1);
		System.out.println("At -1 Index: " + listIndex);
		listIndex.insert(300, 5);
		System.out.println("At 5th Index: " + listIndex);
		listIndex.insert(400, 10);
		System.out.println("At 10th Index: " + listIndex);

		listIndex.insertAtHead(100);
		listIndex.insertAtHead(101);
		listIndex.insertAtHead(102);
		listIndex.insertAtHead(103);
		System.out.println(listIndex);
		listIndex.insert(201, 2);
		System.out.println(listIndex);

		// Pop operation
		System.out.println("POP Operation");
		LinkedList<Integer> listPop = new LinkedList<Integer>();
		listPop.insertAtTail(100);
		listPop.insertAtTail(200);
		listPop.insertAtTail(300);
		listPop.insertAtTail(400);
		listPop.insertAtTail(500);
		System.out.println(listPop);
		System.out.println("******************");
		System.out.println(listPop.pop());
		System.out.println(listPop);

		// Contains method
		System.out.println("Contains Mathod");
		LinkedList<Integer> listContains = new LinkedList<Integer>();
		listContains.insertAtTail(100);
		listContains.insertAtTail(200);
		listContains.insertAtTail(300);
		listContains.insertAtTail(400);
		listContains.insertAtTail(500);
		System.out.println(listContains);
		System.out.println("\nList contains 100? " + listContains.contains(100));
		System.out.println("\nList contains 400? " + listContains.contains(400));
		System.out.println("\nList contains 600? " + listContains.contains(600));
		listContains.insertAtTail(600);
		System.out.println("\nList contains 600 (After Insertion)?  " + listContains.contains(600));

		// Deleting a node from linkList
		System.out.println("Deleting a node from linkList");
		LinkedList<Integer> listDelete = new LinkedList<Integer>();
		listDelete.insertAtTail(100);
		listDelete.insertAtTail(200);
		listDelete.insertAtTail(300);
		listDelete.insertAtTail(400);
		listDelete.insertAtTail(500);
		System.out.println(listDelete);

		listDelete.delete(200);
		System.out.println();
		System.out.println(listDelete);

		listDelete.delete(300);
		System.out.println();
		System.out.println(listDelete);

		listDelete.delete(500);
		System.out.println();
		System.out.println(listDelete);

		// finding All nodes less than a value
		System.out.println(" finding All nodes less than a value");
		LinkedList<Integer> listLessThanValue = new LinkedList<Integer>();
		listLessThanValue.insertAtTail(100);
		listLessThanValue.insertAtTail(200);
		listLessThanValue.insertAtTail(300);
		listLessThanValue.insertAtTail(400);
		listLessThanValue.insertAtTail(500);
		System.out.println(listLessThanValue);

		System.out.println();
		System.out.println("Less than 300: " + listLessThanValue.findAllLessThan(300));

	}

}
