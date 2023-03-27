import java.util.Scanner;
public class Polynomial {
    static class Node {
        int coeff;
        int deg;
        Node next;

        Node(int c, int d) {
            this.coeff = c;
            this.deg = d;
        }
    }

    public static Node head=null;
    public static Node tail=null;

    // add node
    public void add(Node t, int c, int d) {   //t node null hai
        Node newNode = new Node(c, d);         //insert at last
        if (t == null) {
            head = tail = newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void addition(Polynomial l1, Polynomial l2) {
        Node temp = l1.head;
        Node temp2 = l2.head;
       if(temp!=null &&  temp2==null) {
           while (temp != null) {
               temp2 = l2.head;
               while (temp2 != null) {
                   if (temp.deg == temp2.deg) {
                       System.out.println("Degree:" + temp.deg + "coefficient:" + (temp.coeff + temp2.coeff));
                   }
                   temp2 = temp2.next;
               }
               temp = temp.next;
           }
       }
           }
    public static void main(String[] args) {
        Polynomial obj =new Polynomial();
        Polynomial obj2 = new Polynomial();
        obj.add(obj.head,10,2);
        obj.add(obj.head,12,1);
        obj.add(obj.head,8,0);
        obj2.add(obj2.head,2,2);
        obj2.add(obj2.head,10,1);
        obj2.add(obj2.head,4,0);
        obj.addition(obj,obj2);
    }

}





