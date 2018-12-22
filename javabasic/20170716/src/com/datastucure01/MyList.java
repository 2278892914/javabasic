package com.datastucure01;

public class MyList<E> {

	private Node<E> first;
	private int size;

	public boolean add(E data) {
		Node<E> node = new Node<E>(data);
		if (first == null) {
			first = node;
			return true;
		}
		Node<E> last = first;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(node);
		size++;
		return true;
	}

	public Node<E> nodeOf(int index) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException("数组下标越界");
		}
		Node<E> node = first;
		int count = 0;
		while (count < index) {
			node = node.getNext();
			count++;
		}
		return node;
	}

	public boolean add(int index, E data) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("下标越界" + index);
		}
		Node<E> node = new Node<E>(data);
		Node<E> prev = nodeOf(index-1);
		node.setNext(prev.getNext());
		size++;
		return true;
	}
	public E remove(int index){
		Node<E> prev = nodeOf(index-1);
		Node<E> next = prev.getNext();
		prev.setNext(null);
		return next.getData();
	}
	public boolean remove(E data){
		if(first.equals(data)){
			Node<E> next = first.getNext();
			first.setNext(null);
			first = next;
			size--;
			return true;
		}
		Node<E> prev = first;
		while(prev.getNext()!=null&& !prev.getNext().equals(data)){
			prev = prev.getNext();
		}
		if(prev.getNext()!=null){
			Node<E> next = prev.getNext();
			prev.setNext(next.getNext());
			next.setNext(null);
			size--;
			return true;
			
		}
		return false;
	}
	public int size(){
		return size;
	}

}
