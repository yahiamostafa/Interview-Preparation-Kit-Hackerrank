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
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
          
          if (root == null || root.data == v1 || root.data == v2)
            return root;
        
          Node left = lca(root.left , v1 , v2);
          Node right = lca(root.right , v1 , v2);
            
           return right == null ? left : left == null ? right : root;
           
    }

	public static Node insert(Node root, int data) {
