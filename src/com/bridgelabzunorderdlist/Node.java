package com.bridgelabzunorderdlist;

public class Node {
	    Node next;
		String data;
		public Node(String data) {
			this.next = null;
			this.data = data;
			UnOrderedList.size++;
		}
		
	}