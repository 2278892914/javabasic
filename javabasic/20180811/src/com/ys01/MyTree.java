package com.ys01;

public class MyTree<V> {
	
	private Node<V> root;
	private Node<V> root1;
	
	public Node<V> add(V v){
		root1 = root;
		if(root == null){
			Node<V> node = new Node<V>(v);
			root = node;
			return root;
		}
		insert(root1,v);
		return root;
	}
	
	private void insert(Node<V> node,V v){
		
		Integer it1 = (Integer)node.getData();
		Integer it2 = (Integer) v;
		
		if(it1.intValue() > it2.intValue()){
			
			if(node.getleftchild() == null){
				node.setleftchild(new Node<V>(v));
				return;
			}
			insert(node.getleftchild(),v);
		}else{
			if(node.getrightchild() == null){
				node.setrightchild(new Node<V>(v));
				return;
			}
			insert(node.getrightchild(),v);
		}
	}
	
	public void Preorder(Node<V> node){
		if(node != null){
			System.out.print(node.getData()+"  ");
			Preorder(node.getleftchild());
			Preorder(node.getrightchild());	
		}
	}
	public void infixorder(Node<V> node){
		if(node != null){
			infixorder(node.getleftchild());
			System.out.print(node.getData()+"  ");
			infixorder(node.getrightchild());
		}
	}
	
	public void epilouge(Node<V> node){
		if(node != null){
			epilouge(node.getleftchild());
			epilouge(node.getrightchild());	
			System.out.print(node.getData()+"  ");
		}
	}
	
	public static void main(String[] args) {
		
		MyTree<Integer> mt = new MyTree<Integer>();
		Node<Integer> root = null;
		Integer []array = {123,54,232,87,343,51,778,34,65,464};
		for(int i=0;i<10;i++){
			root=mt.add(array[i]);
		}
		//System.out.println(root.getData());
		mt.Preorder(root);
		System.out.println();
		mt.infixorder(root);
		System.out.println();
		mt.epilouge(root);
	}
}
