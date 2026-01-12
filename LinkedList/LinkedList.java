public class LinkedList {
     Node head;

     public static void main(String[] args) {
          LinkedList lst = new LinkedList();
          lst.insertAtEnd(1);
          lst.insertAtEnd(2);
          lst.insertAtEnd(3);
          lst.insertAtBeginning(0);
          lst.print();
     }

     public void insertAtBeginning(int data){
          Node newNode = new Node(data);
          newNode.nextNode = head;
          head = newNode;
     }

     public void insertAtEnd(int data){
          Node newNode = new Node(data);
          Node temp = head;

          if(head == null){
               head = newNode;
          } else {
               while (temp.nextNode != null) {
                    temp = temp.nextNode;
               }
               temp.nextNode = newNode;
          }
     }

     void print(){
          Node temp = head;

          while (temp != null) {
               System.out.println(temp.data);
               temp = temp.nextNode;
          }
     }
}