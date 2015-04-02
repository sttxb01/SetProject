public class Card {
  // Create the rest of this class yourself
  
  private int quantity;
  private int color;
  private int shading;
  private int shape;
  
  public Card(int cQ, int cC, int cS, int cSh) {
    quantity = fixValue(cQ);
    color = fixValue(cC);
    shading = fixValue(cS);
    shape = fixValue(cSh);
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public int getColor() {
    return color;
  }
  
  public int getShading() {
    return shading;
  }
  
  public int getShape() {
    return shape;
  }
  
  public boolean isSet(Card card1, Card card2) {
    return ((quantity + card1.getQuantity() + card2.getQuantity()) % 3 == 0) &&
      ((color + card1.getColor() + card2.getColor()) % 3 == 0) &&
      ((shading + card1.getShading() + card2.getShading()) % 3 == 0) &&
      ((shape + card1.getShape() + card2.getShape()) % 3 == 0);
  }
  
  public String toString() {
    String stringOfQuantity = "" + quantity;
    String stringOfColor = "";
    String stringOfShading = "";
    String stringOfShape = "";
    
    if (color == 1) {
      stringOfColor = "R";
    }
    if (color == 2) {
      stringOfColor = "G";
    }
    if (color == 3) {
      stringOfColor = "P";
    }
    if (shading == 1) {
      stringOfShading = "O";
    }
    if (shading == 2) {
      stringOfShading = "T";
    }
    if (shading == 3) {
      stringOfShading = "S";
    }
    if (shape == 1) {
      stringOfShape = "O";
    }
    if (shape == 2) {
      stringOfShape = "D";
    }
    if (shape == 3) {
      stringOfShape = "S";
    }
    
    return (stringOfQuantity + stringOfColor + stringOfShading + stringOfShape);
  }
  
  private int fixValue(int valueToFix) {
    if (valueToFix < 1 || valueToFix > 3)
      return (((valueToFix % 3) + 3) % 3) + 1;
    else
      return valueToFix;
  }
  
  public boolean equals(Object obj) {
    Card that = (Card)obj;
    
    return quantity == that.getQuantity() &&
      color == that.getColor() &&
      shading == that.getShading() &&
      shape == that.getShape();
  }
}
