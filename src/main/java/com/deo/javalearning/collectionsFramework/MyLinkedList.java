package com.deo.javalearning.collectionsFramework;

public class MyLinkedList<T> {
    private Node<T> head;

    static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T element) {
        if (head == null) {
            head = new Node<>(element);
        } else {
            Node<T> temp = head;
            head = new Node<>(element);
            head.next = temp;
        }
    }

    public T poll() {
        if (head.next == null) {
            T value = head.value;
            head = null;
            return value;
        } else {
            T value = head.value;
            head = head.next;
            return value;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ints = new MyLinkedList<>();
        ints.add(2);
        ints.add(4);
        ints.add(5);

        ints.poll();
        ints.poll();
        ints.poll();
    }

}
