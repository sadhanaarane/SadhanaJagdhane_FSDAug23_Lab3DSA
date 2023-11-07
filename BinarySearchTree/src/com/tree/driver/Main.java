package com.tree.driver;

import java.util.Scanner;

import com.tree.service.BinarySearchTree;
import com.tree.service.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		BinarySearchTree bst = new BinarySearchTree();
		root = bst.insertNode(root, 40);
		root = bst.insertNode(root, 20);
		root = bst.insertNode(root, 60);
		root = bst.insertNode(root, 10);
		root = bst.insertNode(root, 30);
		root = bst.insertNode(root, 50);
		root = bst.insertNode(root, 70);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum to find pair in binary search tree: ");
		int sum = sc.nextInt();

		bst.findPairFromSum(root, sum);

		sc.close();
	}

}
