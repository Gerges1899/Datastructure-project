/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author gerge
 */
public class Queue {

    Node front, rear;
    int c;

    public Queue() {
        front = rear = null;
        c = 0;
    }

    public Node CreateNode(int data, int p) {
        Node node = new Node();
        if (node != null) {
            node.Data = data;
            node.Next = null;
            node.p = p;
        }
        return node;
    }

    public boolean EnQueue(int d, int p) {
        boolean retval = false;
        Node temp = CreateNode(d, p);
        if (temp != null) {
            if (front == null) {
                front = temp;
                rear = temp;
            } else {
                rear.Next = temp;
                rear = temp;
            }
            c++;
            retval = true;
        }
        return retval;

    }

    public Node DeQueue() {
        Node temp;
        temp = front;
        if (front != null) {
            if (front == rear) {
                rear = null;
            }
            front = front.Next;
            c--;

        }
        return temp;
    }

}
