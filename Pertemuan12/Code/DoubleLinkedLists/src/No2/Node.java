/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author irulg
 */
public class Node {
    Buku data;
    Node prev;
    Node next;
    
    Node(Node prev, Buku data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}