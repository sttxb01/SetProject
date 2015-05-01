public class Game {
  private Table t;
  
  private Deck d;
  
  public Game() {
    t = new Table();
    
    d = new Deck();
    
    for(int i = 0; i < 12; i++) {
      t.add(d.getNext());
    }
  }
  
  public Game(String str) {
    t = new Table();
    
    d = new Deck(str);
    
    int i = 0;
    
    while(d.hasNext() == true && i < 12) {
      t.add(d.getNext());
      
      i++;
    }
  }
  
  public int numSets() {
    return t.numSets();
  }
  
  public int numCards() {
    return t.numCards();
  }
  
  public void playRound() {
    int c1 = 0;
    
    if(t.numSets() == 0) {
      while(d.hasNext() == true && c1 < 3) {
        c1++;
        
        t.add(d.getNext());
      }
      return;
    }
    
    if(t.numSets() != 0) {
      for(int a = 0; a < t.numCards() - 2; a++) {
        for(int e = a + 1; e < t.numCards() - 1; e++) {
          for(int i = e + 1; i < t.numCards(); i++) {
            if(t.getCard(a).isSet(t.getCard(e), t.getCard(i))) {
              t.removeSet(t.getCard(a), t.getCard(e), t.getCard(i));
              if(numCards() <= 9) {
                int c2 = 0;
                
                while(d.hasNext() == true && c2 < 3) {
                  c2++;
                  
                  t.add(d.getNext());
                }
              }
              
              return;
            }
          }
        }
      }
    }
  }
  
  public boolean isGameOver() {
    if(d.hasNext() == false) {
      if(numSets() == 0) {
        return true;
      }
    }
    
    return false;
  }
}