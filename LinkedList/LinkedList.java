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

          if(head == null){ // head null aa iruntha athu thaa first node so push there
               head = newNode;
          } else {
               while (temp.nextNode != null) { // if it is not null - iterate until the last element and push it after last node
                    temp = temp.nextNode;
               }
               temp.nextNode = newNode; // assigning the nextNode as newNode we created.
          }
     }

     void print(){
          Node temp = head; // dont change the head - so we using the temp variable for head to process safely

          while (temp != null) { // printing until the last node - which node has null is last node so iterate until the last node.
               System.out.println(temp.data);
               temp = temp.nextNode;
          }
     }
}