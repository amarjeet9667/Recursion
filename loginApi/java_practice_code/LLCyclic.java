import java.util.*;

public class LLCyclic {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("Null");
    }

    // ............ Creating Cycle LinkedList.........
    public void createCycle() {
        if (head == null)
            return;

        Node temp = head;
        Node thirdNode = null;

        int count = 1;

        // Traverse list
        while (temp.next != null) {
            if (count == 3) {
                thirdNode = temp; // store 3rd node
            }
            temp = temp.next;
            count++;
        }

        // temp is last node
        temp.next = thirdNode; // create cycle
    }
    
    //..............Detect LinkedList cyclic........
    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    //............Remove Cycle............
    public void removeCycle(){

        Node fast = head;
        Node slow = head;
        boolean isCyclic = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                isCyclic = true;
                break;
            }

        }
        if(!isCyclic){
            return;
        }

        slow = head;
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        fast.next = null;
         
    }

    public static void main(String[] arg) {
        LLCyclic list = new LLCyclic();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.printList();

        list.createCycle(); // create cycle

        System.out.println("Cycle created!");

        boolean result = list.hasCycle();

        System.out.println(result);

        list.removeCycle();
        list.printList();


    }

}
