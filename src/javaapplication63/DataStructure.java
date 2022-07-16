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
public class DataStructure {

    public void start() {
        
        Queue Q1 = new Queue();
        Queue Q2 = new Queue();
        Queue Q3 = new Queue();
        Stack S2 = new Stack();
        CDLinkedList L2 = new CDLinkedList();
        int c = 0;
        int G = 0;
        int i=1;
          while(c<=100){    
            G = random(4);
            switch (G) {
                case 1:
                    if (i <= 100) {
                        Q1.EnQueue(i, random(5));
                        i++;
                    }
                    break;
                case 2:
                    if (Q1.c > 0) {
                        Node t = Q1.DeQueue();
                        if (S2.c < Q2.c && S2.c < L2.c){
                            S2.push(t.Data, t.p);
                        }else if (Q2.c < S2.c && Q2.c < L2.c){
                            Q2.EnQueue(t.Data, t.p);
                        }else if (L2.c < S2.c && L2.c < Q2.c){
                            L2.Insertsorted(t.Data, t.p);
                        }else{
                            switch (random(3)) {
                                case 1:
                                    S2.push(t.Data, t.p);
                                    break;
                                case 2:
                                    Q2.EnQueue(t.Data, t.p);
                                    break;
                                case 3:
                                    L2.Insertsorted(t.Data, t.p);
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (S2.c + Q2.c + L2.c > 0) {
                        Node t;
                        if (S2.c > Q2.c && S2.c > L2.c) {
                            t = S2.pop();
                            Q3.EnQueue(t.Data, t.p);
                        } else if (Q2.c > S2.c && Q2.c > L2.c) {
                            t = Q2.DeQueue();
                            Q3.EnQueue(t.Data, t.p);
                        } else if (L2.c > S2.c && L2.c > Q2.c) {
                            t = L2.delete();
                            Q3.EnQueue(t.Data, t.p);
                        } else {
                            switch (random(3)) {
                                case 1:
                                    if (S2.c > 0) {
                                        t = S2.pop();
                                        Q3.EnQueue(t.Data, t.p);
                                    }
                                    break;
                                case 2:
                                    if (Q2.c > 0) {
                                        t = Q2.DeQueue();
                                        Q3.EnQueue(t.Data, t.p);
                                    }
                                    break;
                                case 3:
                                    if (L2.c > 0) {
                                        t = L2.delete();
                                        Q3.EnQueue(t.Data, t.p);
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                    
                case 4:
                    
                    if (Q3.c > 0) {
                        c++;
                        Node print = Q3.DeQueue();
                        System.out.println("Data= "+print.Data + "   " +"Piority= "+print.p);
                      
                         if(c==100){
                return;}
                    }
                    break;
            }
         
            
        }
       

    }

    public static int random(int a) {
        return (int) ((Math.random() * a) + 1);
    }
}
