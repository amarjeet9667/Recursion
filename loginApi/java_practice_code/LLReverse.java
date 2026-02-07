import java.util.*;

public class LLReverse {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){ // constructor
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public void reverseList(){ 

        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode; // 3rd node change to 1st 

            //update
            prevNode = currentNode; // 1st change to 2nd
            currentNode = nextNode;// 2nd change to 3rd
        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] arg){
        LLReverse list = new LLReverse();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.addLast(4);
        list.addLast(5);
        list.printList();

        list.reverseList();
        list.printList();

        System.out.println("Recursion methode:- ");
        list.head = list.reverseListRecursive(list.head);
        list.printList();
    }
}
