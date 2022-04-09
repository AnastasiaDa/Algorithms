package com.company;

public class Stack {

    private class Node {
        int value;
        Node prev;

        public Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
        }
    }

    Node head;

    public void push (int value) {
        if(head == null) {
            head = new Node(value, null);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public int pop(Stack stack) {
        if(head == null) {
            return 0;
        } else {
            int value = head.value;
            head = head.prev;
            return value;
        }
    }

    public void printMe() {
        if(head == null) {
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while(node != null) {
                System.out.print(node.value);
                if(node.prev != null) {
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
            System.out.println();
        }
    }

    public Stack reverse() {
        Node node = head;
        head = null;

        while(node != null) {
            push(node.value);
            node = node.prev;
        }
        return this; // не уверена, что верно, но Stack не возвращает

    }

}

