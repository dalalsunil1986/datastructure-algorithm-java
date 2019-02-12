package com.hellokoding.datastructure;

import java.util.NoSuchElementException;

public class MyDequeue {
    private int[] dequeue;
    private int front;
    private int rear;

    public MyDequeue(int capacity) {
        this.dequeue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueueFirst(int x) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        for (int i = rear; i > front ; i--) {
            dequeue[i] = dequeue[i-1];
        }

        dequeue[front] = x;
        rear++;
    }

    public void enqueueLast(int x) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        dequeue[++rear] = x;
    }

    public int dequeueFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return dequeue[front++];
    }

    public int dequeueLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        rear--;
        return dequeue[rear];
    }

    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return dequeue[front];
    }

    public int rear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return dequeue[rear-1];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == dequeue.length;
    }

    public int size() {
        return rear - front;
    }

    public static void main(String[] args) {
        MyDequeue myQueue = new MyDequeue(3);
        myQueue.enqueueFirst(1);
        myQueue.enqueueLast(2);
        myQueue.enqueueFirst(3);

        System.out.println(myQueue.front()); // 3
        System.out.println(myQueue.dequeueFirst()); // 3
        System.out.println(myQueue.front()); // 1

        System.out.println(myQueue.size()); // 1
        System.out.println(myQueue.isEmpty()); // false
        System.out.println(myQueue.isFull()); // false
    }
}
