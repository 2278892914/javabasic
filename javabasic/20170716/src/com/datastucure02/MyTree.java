package com.datastucure02;

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
	
	public void remove(V,v){
		
		Integer  it1 = root.getData();
		
		
	}
	
	
	private void leftDel(Node<V> node,V v){
		if(node==null){
			return ;
		}
		Node<V> left = node.getLeftChild();
		Integer it1 = (Integer)left.getData();
		Integer it2 = (Integer)v;
		if(left!=null&&it1==it2){
			if(left.getLeftChild()==null&&left.getRightChild()==null){
				node.setLeftChild(null);
			}else if(left.getLeftChild()!=null&&left.getRightChild()==null){
				node.setLeftChild(left.getLeftChild());
			}else if(left.getLeftChild()==null&&left.getRightChild()!=null){
				node.setLeftChild(left.getLeftChild());
			}
		}
	}
		private void rightDel(Node<V> node,V v){
			if(node==null){
				return;
			}
			Node<V> right = node.getRightChild();
			Integer it1 = (Integer)right.getData();
			Integer it2 = (Integer) v;
			if(right!=null&&it1==it2){
				
			}else if(right!=null&&it1<it2){
				rightDel(right,v);
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
}
