class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

public class Node{
  private int data;
  private Node nextNote;
  
  public Node(int data){
    this.data = data;
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