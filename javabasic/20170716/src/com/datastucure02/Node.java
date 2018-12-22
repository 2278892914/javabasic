package com.datastucure02;

public class Node<V> {
	
	private V data;
	
	private Node<V> leftChild;
	private Node<V> rightChild;
	
	public Node(V data) {
		this.data = data;
	}

	public Node<V> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<V> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<V> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<V> rightChild) {
		this.rightChild = rightChild;
	}

	public V getData() {
		return data;
	}
	
	
	
	
}
