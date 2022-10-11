package com.datastructres;

import java.util.List;
import java.util.ArrayList;

public class LinkedList<T extends Comparable<T>> {
	private Node<T> head;

	public LinkedList() {
	}

	// For inserting data at Head
	public void insertAtHead(T data) {
		Node<T> node = new Node<T>(data);
		if (head != null) {
			node.setNext(head);
		}
		head = node;
	}

	@Override
	public String toString() {
		if (head == null) {
			return "";
		}
		return head.toString();
	}

	// For counting the number of nodes
	public int countNodes() {
		Node<T> curr = head;
		int count = 0;
		while (curr != null) {
			curr = curr.getNext();
			count++;
		}
		return count;
	}

	// For inserting data at tail node
	public void insertAtTail(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			return;
		}
		Node<T> curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(node);
	}

	// Insertion of node at specific Location
	public void insert(T data, int index) {
		if (index <= 0) {
			insertAtHead(data);
			return;
		}
		Node<T> curr = head;
		int currIndex = 1;
		while (curr.getNext() != null && currIndex < index) {
			curr = curr.getNext();
			currIndex++;
		}
		Node<T> next = curr.getNext();
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(next);
		curr.setNext(newNode);
	}
	// for Pop operation for removing an element

	public T pop() {
		if (head == null) {
			return null;
		}
		Node<T> first = head;
		head = head.getNext();
		return first.getData();
	}

	// Contains Method
	public boolean contains(T data) {
		Node<T> curr = head;
		while (curr != null) {
			if (curr.getData().equals(data)) {
				return true;
			}
			curr = curr.getNext();
		}
		return false;
	}

	// Deleting a node from linkList
	public void delete(T data) {
		Node<T> curr = head;
		Node<T> prev = null;
		while (curr != null) {
			if (curr.getData().equals(data)) {
				if (prev == null) {
					head = head.getNext();
				} else {
					prev.setNext(curr.getNext());
				}
				break;
			}
			prev = curr;
			curr = curr.getNext();
		}
	}

	// finding All nodes less than a value
	public List<T> findAllLessThan(T data) {
		List<T> list = new ArrayList<>();
		Node<T> curr = head;
		while (curr != null) {
			if (curr.getData().compareTo(data) < 0) {
				list.add(curr.getData());
			}
			curr = curr.getNext();
		}
		return list;
	}

}
