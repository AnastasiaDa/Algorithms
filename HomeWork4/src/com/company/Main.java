package com.company;

public class Main {

    public static void add (int value) {
        System.out.println("Add " + value);
    }

    public static void remove () {
        System.out.println("Remove from the stack");

    }

    public static void reversePrint() {
        System.out.println("Reverse! ");
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.printMe();
        add(0);
        stack.push(0);
        stack.printMe();
        add(1);
        stack.push(1);
        stack.printMe();
        add(2);
        stack.push(2);
        stack.printMe();
        add(3);
        stack.push(3);
        stack.printMe();
        add(4);
        stack.push(4);
        stack.printMe();
        add(5);
        stack.push(5);
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();
        reversePrint();
        stack.reverse();
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();
        reversePrint();
        stack.reverse();
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();
        remove();
        System.out.println(stack.pop(stack));
        stack.printMe();

    }
}

