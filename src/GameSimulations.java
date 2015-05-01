public class GameSimulations {
  public static void main(String[] args) {
    int games = 1000000;
    
    int sets = 0;
    
    int meatloaves = 0;
    
    for(int i = 0; i <= games; i++) {
      Game game = new Game();
      
      sets += game.numSets();
      
      while(game.isGameOver() == false) {
        game.playRound();
      }
      
      meatloaves += game.numCards();
    }
    
    System.out.println("Number of sets: " + sets);
    
    System.out.println("Number of card leftovers: " + meatloaves);
    
    System.out.println("Average number of sets: " + sets / 1000000);
    
    System.out.println("Average number of card leftovers: " + meatloaves / 1000000);
  }
}