/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 9087
 */
public class Tree {
    Node root;
    Queue<Node> q; 
    
    Tree(int key){
        root = new Node(key);
    }
    Tree(){
        root = null;
    }
    
    public boolean isEmpty(){
        if (root == null) {
            return true;
        }
        return false;
    }
    
    //Print Nodes
    public void breadthFirst(){
        if (!isEmpty()) {
            q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node n = q.remove();
                System.out.println(n.getPayload());
                if (n.left!=null) {
                    q.add(n.left);
                }
                if (n.right!=null) {
                    q.add(n.right);
                }
            }
        }
    }
    
    //Breadth First
    public void postOrder(Node node){
        if (node!=null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.getPayload());
        } 
    }
    
    public void preOrder(Node node){
        if (node!=null) {
            System.out.println(node.getPayload());
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    public void inOrder(Node node){
        if (node!=null) {
            inOrder(node.left);
            System.out.println(node.getPayload());
            inOrder(node.right);
        }
    }
    
    //Add (Looping)
    public void add(int payload){
        if (isEmpty()) {
            root = new Node(payload);
        }else{
            Node current = root;
            while(current!=null){
                if (payload<current.getPayload()) {
                    if(current.left==null){
                        current.left = new Node(payload);
                        break;
                    }
                    current = current.left;
                }else{
                    if(current.right==null){
                        current.right = new Node(payload);
                        break;
                    }
                    current = current.right;
                }
            }
            current = new Node(payload);
        }
    }
    
    //Add (Recursion)
    public void insert(int payload){
        if (isEmpty()) {
            root = new Node(payload);
        }else{
            insertChild(payload,root);
        }
    }
    private void insertChild(int payload, Node current) {
        if (payload<current.getPayload()) {
            if (current.left==null) {
                current.left = new Node(payload);
            }else{
                insertChild(payload,current.left);
            }
        }else{
            if (current.right==null) {
                current.right = new Node(payload);
            }else{
                insertChild(payload,current.right);
            }
        }
    }
    
    //Rmoving 
    public void remove(int criteria){
        Node parent = null;
        Node nodeToDelete = root;
        
        //Changing Pointers
        while(nodeToDelete!=null && nodeToDelete.getPayload()!=criteria){
            parent = nodeToDelete;
            if (criteria<nodeToDelete.getPayload()) {
                nodeToDelete = nodeToDelete.left;
            }else{
                nodeToDelete = nodeToDelete.right;
            }
        }
        
        //Leaf Node
        if (nodeToDelete.left==null && nodeToDelete.right==null) {
            parent
        }
    }

    
    
}
