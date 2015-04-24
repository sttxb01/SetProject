public class Game {
  private Table t;
  
  private Deck d;
  
  public void Game() {
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
    
  }
  
  public boolean isGameOver() {
    if(d.hasNext() == false) {
      if(t.numSets() == 0) {
        return true;
      }
    }
    
    return false;
  }
}