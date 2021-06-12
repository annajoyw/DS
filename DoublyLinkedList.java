public class DoublyLinkedList {
  private DoublyLinkedNode head;

  public void insertAtHead (int data) {
    DoublyLinkedNode newNode = new DoublyLinkedNode(data) 
    ;
    newNode.setNextNode(this.head);
    if (this.head != null) {
      this.head.setPreviousNode(newNode);
    }
    this.head = newNode;
  }

   public int length(){
    int length = 0;
    Node current = this.head;

    while(current != null){
      length ++;
      current = current.getNextNode();
    }
    return length;
  }
  
}