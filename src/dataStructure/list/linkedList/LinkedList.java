package dataStructure.list.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data=input;
            this.next =null;
        }
        public String toString() {
            System.out.print("tali : " + this.next + " --> ");
            return String.valueOf(this.data);
        }
    }
    public void addFirst(Object input){
        Node newNode =new Node(input);
        newNode.next =head;
        head = newNode;
        size ++;
        if (head.next  == null){
            tail = head;
        }
        System.out.println(newNode.toString());

    }
    public void addLast(Object input){
        Node newNode = new Node(input);
        if (size == 0){
            addFirst(input);
        }else{
            tail.next =newNode;
            tail = newNode;
            size ++;
        }

    }
    /*public Node node(int index){
        Node x = head;
        for( int i = 0 ; i <x )
        return x;
    }*/

}
