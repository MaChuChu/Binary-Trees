
package binarytrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 9087
 */
public class BinaryTrees {

    public static void main(String[] args) {
        Queue<Node> q = new LinkedList<>(); 
        
        Tree myTree = new Tree();
        
        myTree.root = new Node(5); 
        myTree.root.left = new Node(3); 
        myTree.root.right = new Node(7);
        
        System.out.println("BreadthFirst");
        myTree.breadthFirst();
        System.out.println("");
        
        System.out.println("Post Order");
        myTree.postOrder(myTree.root);
        System.out.println("");
        
        System.out.println("Pre Order");
        myTree.preOrder(myTree.root);
        System.out.println("");
        
        System.out.println("In Order");
        myTree.inOrder(myTree.root);
        System.out.println("");
        
        myTree.add(1);
        myTree.add(2);
        myTree.insert(10);
        myTree.breadthFirst();
    }
    
}
