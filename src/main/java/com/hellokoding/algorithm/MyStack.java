package com.hellokoding.algorithm;

import java.util.NoSuchElementException;

public class MyStack {
    private final int[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            throw new StackOverflowError();
        }

        top++;
        stack[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        myStack.push(4);
        myStack.push(2);
        myStack.push(5);

        System.out.println(myStack.peek()); // 5

        System.out.println(myStack.pop()); // 5

        System.out.println(myStack.peek()); // 2

        System.out.println(myStack.size()); // 2

        System.out.println(myStack.isEmpty()); // false
    }
}
