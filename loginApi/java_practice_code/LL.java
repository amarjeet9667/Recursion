import java.util.*;

public class LL {
    
    Node head;

    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next; // a data type can be named as class but it is not class or constructor is a reference

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add first in linkedlist
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // Add last in linkedList
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        size--;
        head = head.next;
        
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    // print linkedlist
    public void printList(){
        if(head == null){
            System.out.println("LikedList is empty.........");
        }

        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] arg){
        LL list = new LL(); // this is call object
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
