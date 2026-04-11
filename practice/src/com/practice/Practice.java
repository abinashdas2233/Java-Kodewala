package com.practice;

import java.util.HashSet;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class Practice{
	public static Node buildTree(Node root,int value) {
		
		if(root==null) {
			return new Node(value);
		}
		if(root.data>value) {
			root.left=buildTree(root.left, value);
		}
		else {
			root.right=buildTree(root.right, value);
		}
		return root;
		
	}
	public static void Inorder(Node root) {
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data+"->");
		Inorder(root.right);
	}
	public static void main(String[] args) {
		int[]arr= {5,1,3,4,2,7};
		Node root=null;
		for(int i=0;i<arr.length;i++) {
			root=buildTree(root, arr[i]);
		}
		
		
		Inorder(root);
		
		
		
	}
}