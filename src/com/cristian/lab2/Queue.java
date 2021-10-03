package com.cristian.lab2;

class QNode {
    int data;
    QNode next;

    public QNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    QNode front;
    QNode rear;

    int size;
    int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.front = this.rear = null;
        this.size = 0;
    }

    public Queue() {
        this.maxSize = -1;
        this.front = this.rear = null;
    }

    public boolean isFull() {
        if (this.maxSize >= 0) {
            return size == maxSize;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int value) {
        if (this.isFull() && this.maxSize != -1) {
            System.out.println("Queue-ul este plin");
            return;
        }

        QNode tempData = new QNode(value);

        if (this.rear == null) {
            this.front = this.rear = tempData;
        }

        this.rear.next = tempData;
        this.rear = tempData;

        this.size++;
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("Queue-ul este gol");
            return;
        }
        if (this.front == null)
            return;

        // QNode tempData = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        this.size--;
    }
}

class testQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(25);
        q.push(53);
        q.push(63);
        System.out.println(q.front.data);
        q.pop();
        System.out.println(q.front.data);
        q.pop();
        System.out.println(q.front.data);
        q.pop();
    }
}
