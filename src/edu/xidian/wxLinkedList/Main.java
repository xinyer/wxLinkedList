package edu.xidian.wxLinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello GitHub!");
		SinglyLinkedList list1 = new SinglyLinkedList();
		Node<Integer> node1 = list1.initList(1,4,5,8);
		SinglyLinkedList list2 = new SinglyLinkedList();
		Node<Integer> node2 = list2.initList(1,2,3,6,8,8,9);
		Node<Integer> node3 = SinglyLinkedList.mergerList(node1, node2);
		SinglyLinkedList.printList(node3);
	}
}
