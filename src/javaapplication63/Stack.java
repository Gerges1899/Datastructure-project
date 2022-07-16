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
public class Stack {

    Node top = null;
    int c = 0;

    public void push(int data, int p) {
        Node N = new Node();
        if (N != null) {
            N.Data = data;
            N.p = p;
            N.Next = top;
            top = N;
            c++;
        }

    }

    public Node pop() {
        Node ret = null;
        if (top != null) {
            ret = top;
            top = top.Next;
            c--;
        }
        return ret;
    }
//public void sort(){
//    Stack A=new Stack();
//    while (top!=null){
//        Node temp=pop();
//       while(A.top!=null&&A.top.Data<temp.Data){
//           push(A.pop().Data);
//       }
//       A.push(temp.Data);
//        
//}
//    while(A.top!=null){
//        push(A.pop().Data);
//    }
//}
//public void print (){
//    Stack t=new Stack();
//    Node temp;
//    while (top!=null){
//        temp=pop();
//        System.out.println(temp.Data);
//        t.push(temp.Data);
//    }
//    while (t.top!=null){
//        push(t.pop().Data);
//    }

//}
}
