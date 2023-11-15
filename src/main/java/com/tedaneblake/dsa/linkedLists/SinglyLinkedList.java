package com.tedaneblake.dsa.linkedLists;

public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
             element = e;
             next = n;
        }
        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public E first() {
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last()  {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    private boolean isEmpty() {
        // linked list must have a head
        return head == null;
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if(size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;

    }

    /**
     * @author Tedane Blake
     * @since 2023-09-19
     * @return the second to last element in the linked list
     */
    public E getSecondToLast() {
        // if size is less than 1, there is no second to last element
        if(size <= 1) {
            return null;
        }
        // start at head
        Node<E> curr = head;
        Node<E> secondToLast = null;
        // while the next element is not null (not the last element)
        while(curr.getNext() != null) {
            // set the second to last element to the current element
            secondToLast = curr;
            // set the current element to the next element
            curr = curr.getNext();
        }
        if (secondToLast != null) {
            return secondToLast.getElement();
        }
        return null;
    }

    public void addAfter(E e, Node<E> node) {
        Node<E> newest = new Node<>(e, node.getNext());
        node.setNext(newest);
        size++;
    }


    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);



        System.out.println("The second to last element is: " + singlyLinkedList.getSecondToLast());
        System.out.println("The first element is: " + singlyLinkedList.first());
    }

}
