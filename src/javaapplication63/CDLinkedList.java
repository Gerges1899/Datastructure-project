/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;
import java.util.Random;
/**
 *
 * @author gerge
 */
public class CDLinkedList {
     Node Head=null;
     int c=0;
public Node createNode(int data,int p){
        Node node=new Node();
        if(node!=null){
          node.Data=data;
          node.p=p;
          node.Next=null;
          node.prev=null;
          
        }
        return node;
    }
public void push_back(int data,int p){
    Node n=createNode(data,p);
    if(n!=null){
        if(Head==null){
            Head=n;
            Head.Next=Head.prev=Head;
            c++;
        }
        else{
            Node last=Head.prev;
            last.Next=n;
            n.prev=last;
            n.Next=Head;
            Head.prev=n;
            c++;
        }
    }
}
public void push_front(int data,int p){
     Node n=createNode(data,p);
    if(n!=null){
        if(Head==null){
            Head=n;
            Head.Next=Head.prev=Head;
            c++;
        }
        else{
             Node last=Head.prev;
           n.Next=Head;
           Head.prev=n;
           Head=n;
           Head.prev=last;
           last.Next=Head;
           c++;
        }
    
}
}
public void Insertsorted(int data,int p){
    Node n=createNode(data,p);
   
        if(Head==null||Head.p>n.p){
            push_front(data,p);
        }
        else{
            Node t=Head;
           
            while(t.Next!=Head&&n.p>=t.p){
                t=t.Next;
            }
            if(t.Next==Head){
                push_back(data,p);}
           
            else{
                t=t.prev;
             n.Next=t.Next;
             t.Next.prev=n;
             t.Next=n;
             n.prev=t;
             c++;
               
            }
                
        
        }
    
    
}
public void print(){
    if(Head!=null){
        Node t=Head;
        while(t.Next!=Head){
            System.out.println(t.Data);
            t=t.Next;
        }
        if(t.Next==Head){
            System.out.println(t.Data);
        }
    }
}
public Node delete(){
    Node temp=null;
  if(Head!=null){
      temp=Head.prev;
      if(Head==Head.prev){
          Head=Head.prev=null;
      }
      else{
          Head.prev=Head.prev.prev;
          Head.prev.Next=Head;
      }
      c--;
  }
  
  return temp;
}
    
}
