package com.tree.service;

import java.util.LinkedList;

public class BinarySearchTree {

	public Node insertNode(Node root, int key) {

		if (root == null) {
			return new Node(key);
		}
		if (key < root.data) {
			root.left = insertNode(root.left, key);
		} else {
			root.right = insertNode(root.right, key);
		}
		return root;
	}

	public void findPairFromSum(Node root, int sum) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		if (!findPair(root, sum, list)) {
			System.out.println("Nodes are not found");
		}

	}

	public boolean findPair(Node root, int sum, LinkedList<Integer> list) {

		if (root == null)
			return false;

		if (findPair(root.left, sum, list))
			return true;

		if (list.contains(sum - root.data)) {
			System.out.println("Pair found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else {
			list.add(root.data);
		}

		return findPair(root.right, sum, list);
	}
}
