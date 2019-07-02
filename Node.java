/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;

/**
 *
 * @author 9087
 */
public class Node {
    private int payload;
    public Node left,right;
    
    Node(int item){
        payload = item;
        left = null;
        right = null;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
}
