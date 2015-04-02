import junit.framework.TestCase;

public class CardTest extends TestCase {

  public void testCard() {
    Card card1 = new Card (1, 1, 1, 1);
    
    assertEquals(1, card1.getQuantity());
    assertEquals(1, card1.getColor());
    assertEquals(1, card1.getShading());
    assertEquals(1, card1.getShape());
  }
  
  public void testSet() {
    Card card1 = new Card(1, 1, 1, 1);
    Card card2 = new Card(2, 2, 2, 2);
    Card card3 = new Card(3, 3, 3, 3);
    
    assertEquals(2, card2.getQuantity());
    assertEquals(2, card2.getColor());
    assertEquals(2, card2.getShading());
    assertEquals(2, card2.getShape());
    assertEquals(3, card3.getQuantity());
    assertEquals(3, card3.getColor());
    assertEquals(3, card3.getShading());
    assertEquals(3, card3.getShape());
    
    assertEquals(true, card1.isSet(card2, card3));
  }
  public void testNegativeCard() {
    Card card1 = new Card(-1, -2, -3, 6);
    assertEquals(3, card1.getQuantity());
    assertEquals(2, card1.getColor());
    assertEquals(1, card1.getShading());
    assertEquals(1, card1.getShape());
  }
  
  public void testToString() {
    Card card1 = new Card(3, 3, 4, 1);
    Card card2 = new Card(-3, -1, 2, 7);
    Card card3 = new Card(2, 2, 2, 2);
    
    assertEquals("3PTO", card1.toString());
    assertEquals("1PTD", card2.toString());
    assertEquals("2GTD", card3.toString());
  }
}
