package com.datastucure01;

public class MyTree<V> {

	private Node<V> root;
	
	
	public void add(V v){
		
		if(root == null){
			Node<V> node = new Node<V>(v);
			root = node;
			return;
		}
		insert(root, v);
	}
	
	private void insert(Node<V> node,V v){
		
		Integer it1 = (Integer) node.getData();
		Integer it2 = (Integer) v;
		
		if(it1.intValue() < it2.intValue()){
			if(node.getLeftChild() == null){
				node.setLeftChild(new Node<V>(v));
				return ;
			}
			insert(node.getLeftChild(),v);
		}else{
			if(node.getRightChild() == null){
				node.setRightChild(new Node<V>(v));
				return ;  //方法的结束
			}
			insert(node.getRightChild(),v);
		}
		
	}
	 
}
