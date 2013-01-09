package edu.xidian.wxLinkedList;

public class SinglyLinkedList {

	/**
	 * merger two sorted list ¹þ¹þ
	 * @param node1
	 * @param node2
	 * @return
	 */
	public static Node<Integer> mergerList(Node<Integer> node1, Node<Integer> node2){
		if(node1==null){
			return node2;
		}
		if(node2==null){
			return node1;
		}
		Node<Integer> newNode = null;
		if(node1.value < node2.value){
			newNode = node1;
			newNode.next = mergerList(node1.next, node2);
		}else{
			newNode = node2;
			newNode.next = mergerList(node1, node2.next);
		}
		
		return newNode;
	}
	
	/**
	 * initialize list
	 * @param val
	 * @return
	 */
	
	public Node<Integer> initList(int...val){
		int len = val.length;
		Node<Integer> temp = new Node<Integer>(val[len-1], null);
		for(int i=len-2;i>=0;i--){
			Node<Integer> node = new Node<Integer>(val[i], temp);
			temp = node;
		}
		return temp;
	}
	
	/**
	 * 
	 * @param val
	 * @return
	 */
/*	public Node<Float> initList(float...val){
		int len = val.length;
		Node<Float> temp = new Node<Float>(val[len-1], null);
		for(int i=len-2;i>=0;i--){
			Node<Float> node = new Node<Float>(val[i], temp);
			temp = node;
		}
		return temp;
	}*/
	
	/**
	 * print list
	 * @param head
	 */
	public static void printList(Node head){
		do{
			System.out.print(head.value+" ");
			head = head.next;
		}while(head!=null);
	}
	
}
