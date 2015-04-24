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
  
  private boolean onTable(Card c) {
    TableNode curr = head;
    
    while(curr != null) {
      if(c.equals(curr.getCard())) {
        return true;
      }
      
      curr = curr.getNext();
    }
    
    return false;
  }
  private void removeCard(Card c){
    TableNode curr = head;
    
    TableNode prev = null;
    
    if(head == null) {
      return;
    }
    
    while(curr != null){
      if(c.equals(curr.getCard())) {
        if(curr == head) {
          head = head.getNext();
        }
        
        else {
          prev.setNext(curr.getNext());
        }
      }
      
      prev = curr;
      
      curr = curr.getNext();
    }
  }
  
  public void removeSet(Card c1, Card c2, Card c3) {
    if(c1.isSet(c2, c3) != true) {
      return;
    }
    
    if(! onTable(c1)) {
      return;
    }
    
    if(! onTable(c2)) {
      return;
    }
    
    if(! onTable(c3)) {
      return;
    }
    
    removeCard(c1);
    
    removeCard(c2);
      
    removeCard(c3);
  }
  
  public int numCards() {
    TableNode temp = head;
    
    int length = 0;
    
    if(head == null) {
      return 0;
    }
    
    while(temp != null) {
      length ++;
      
      temp = temp.getNext();
    }
    
    return length;
  }
  
  public Card getCard(int index) {
    TableNode curr = head;
    
    if(head == null) {
      return null;
    }
    
    if(index < numCards())
    {
      for(int i = 0; i < index; i++)
      {
        curr = curr.getNext();
      }
      return curr.getCard();
    }
    else
      return null;
  }
  
  public int numSets() {
    TableNode nodeA = head;
    
    TableNode nodeB = null;
    
    TableNode nodeC = null;
    
    int numSets = 0;
    
    while(nodeA != null && nodeA.getNext() != null && nodeA.getNext().getNext() != null) {
      nodeB = nodeA.getNext();
      
      while(nodeB != null && nodeB.getNext() != null) {
        nodeC = nodeB.getNext();
        
        while(nodeC != null) {
          if(nodeA.getCard().isSet(nodeB.getCard(), nodeC.getCard())) {
            numSets ++;
          }
          
          nodeC = nodeC.getNext();
        }
        
        nodeB = nodeB.getNext();
      }
      
      nodeA = nodeA.getNext();
    }
    
    return numSets;
  }
}