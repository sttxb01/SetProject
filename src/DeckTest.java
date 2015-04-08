import junit.framework.TestCase;


public class DeckTest extends TestCase {
  public void test3CardDeck() {
    Deck deck = new Deck("3cards.dat");
  
    Card card1 = new Card(1, 1, 1, 1);
    Card card2 = new Card(1, 1, 1, 2);
    Card card3 = new Card(1, 1, 1, 3);
    
    assertTrue(deck.hasNext());
    assertTrue(deck.getNext().equals(card1));
    assertTrue(deck.hasNext());
    assertTrue(deck.getNext().equals(card2));
    assertTrue(deck.hasNext());
    assertTrue(deck.getNext().equals(card3));
    assertFalse(deck.hasNext());
    assertNull(deck.getNext());
  }
  
  public void test0CardDeck() {
    Deck deck = new Deck("0cards.dat");
    
    assertFalse(deck.hasNext());
    assertNull(deck.getNext());
  }
  
  public void testDeck() {
    Deck deck = new Deck();
    
    int i = 0;
    
    while (deck.hasNext()) {
      deck.getNext();
      i += 1;
    }
    
    assertEquals(81, i);
  }
}
