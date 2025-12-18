class Node {
     Node next;
     Node prev;
     int data;

     Node(int data){
          this.data = data;
     }
}

class DoublyLinkedList {
     static Node head;

     public static void main(String[] args) {
          Node newNode = new Node(1);
          head = newNode;
          Node temp = head;
          Node prev = temp;
          temp.next = new Node(2);
          temp = temp.next;
          temp.prev = prev;
          temp.next = new Node(3);
     }
}