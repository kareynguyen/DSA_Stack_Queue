class Solution {
    static class Node{
        int data;
        Node link;
    }

    static class Queue{
        Node front, rear;
    }

    static void enQueue(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else q .rear .link = temp;
        q .rear = temp;
        q .rear .link = q .front;
    }

    static int deQueue(Queue q){
        if (q .front ==  null)
        {
            System.out.printf ("Queue is empty");
        }
        // If this is the last node to be deleted
        int value; // Value to be dequeued
        if (q .front == q .rear)
        {
            value = q .front .data;
            q .front =  null;
            q .rear =  null;
        }
        else  // There are more than one nodes
        {
            Node  temp = q .front;
            value = temp .data;
            q .front = q .front .link;
            q .rear .link= q .front;
        }

        return value;
    }

    static void display(Queue q){
        Node temp = q.front;
        System.out.println("\nElements in Circle Queue are: ");
        while (temp.link != q.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
    public static void main(String[] args) {
        Queue  q = new Queue();
        q .front = q .rear =  null;

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        display(q);

        // Deleting elements from Circular Queue
        System.out.printf("\nDeleted value = %d", deQueue(q));
        System.out.printf("\nDeleted value = %d", deQueue(q));

        // Remaining elements in Circular Queue
        display(q);
        enQueue(q, 9);
        enQueue(q, 20);
        display(q);
    }
    }


