public class DoublyLinkedNode {
  private int data;
  private DoublyLinkedNode nextNode;
  private DoublyLinkedNode previousNode;

  public DoublyLinkedNode (int data) {
    this.data=data;
  }

  public int getData(){
    return this.data;
  }

  public Node getNextNode(){
    return this.nextNode;
  }

  public void setData(int data){
    this.data = data;
  }
  
  public void setNextNode(Node nextNode){
    this.nextNode = nextNode;
  }
}

