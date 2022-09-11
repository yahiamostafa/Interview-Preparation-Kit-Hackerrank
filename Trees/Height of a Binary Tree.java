import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
          if (root == null)
            return -1;
            
          int leftHeight = height(root.left);
          int rightHeight = height(root.right);
          
          return 1 + Math.max(leftHeight, rightHeight);
    }

	public static Node insert(Node root, int data) {
