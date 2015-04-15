public class Table {
  private TableNode head;
  
  public Table() {
    head = null;
  }
  
  public void add(Card card) {
    TableNode tempNode = new TableNode(card);
    
    tempNode.setNext(head);
    
    head = tempNode;
  }
  
  public void removeSet(Card c1, Card c2, Card c3) {
    
  }
}