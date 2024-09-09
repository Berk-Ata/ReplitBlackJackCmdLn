import java.util.*;

class Deck{

  private ArrayList<Card> deckOfCards = new ArrayList<Card>();

  Deck(){
     //SPADES
     deckOfCards.add(new Card("2", "S"));
     deckOfCards.add(new Card("3", "S"));
     deckOfCards.add(new Card("4", "S"));
     deckOfCards.add(new Card("5", "S"));
     deckOfCards.add(new Card("6", "S"));
     deckOfCards.add(new Card("7", "S"));
     deckOfCards.add(new Card("8", "S"));
     deckOfCards.add(new Card("9", "S"));
     deckOfCards.add(new Card("10", "S"));
     deckOfCards.add(new Card("J", "S"));
     deckOfCards.add(new Card("Q", "S"));
     deckOfCards.add(new Card("K", "S"));
     deckOfCards.add(new Card("A", "S"));
     //HEARTS
     deckOfCards.add(new Card("2", "H"));
     deckOfCards.add(new Card("3", "H"));
     deckOfCards.add(new Card("4", "H"));
     deckOfCards.add(new Card("5", "H"));
     deckOfCards.add(new Card("6", "H"));
     deckOfCards.add(new Card("7", "H"));
     deckOfCards.add(new Card("8", "H"));
     deckOfCards.add(new Card("9", "H"));
     deckOfCards.add(new Card("10", "H"));
     deckOfCards.add(new Card("J", "H"));
     deckOfCards.add(new Card("Q", "H"));
     deckOfCards.add(new Card("K", "H"));
     deckOfCards.add(new Card("A", "H"));
     //CLUB
     deckOfCards.add(new Card("2", "C"));
     deckOfCards.add(new Card("3", "C"));
     deckOfCards.add(new Card("4", "C"));
     deckOfCards.add(new Card("5", "C"));
     deckOfCards.add(new Card("6", "C"));
     deckOfCards.add(new Card("7", "C"));
     deckOfCards.add(new Card("8", "C"));
     deckOfCards.add(new Card("9", "C"));
     deckOfCards.add(new Card("10", "C"));
     deckOfCards.add(new Card("J", "C"));
     deckOfCards.add(new Card("Q", "C"));
     deckOfCards.add(new Card("K", "C"));
     deckOfCards.add(new Card("A", "C"));
     //DIAMONDS
     deckOfCards.add(new Card("2", "D"));
     deckOfCards.add(new Card("3", "D"));
     deckOfCards.add(new Card("4", "D"));
     deckOfCards.add(new Card("5", "D"));
     deckOfCards.add(new Card("6", "D"));
     deckOfCards.add(new Card("7", "D"));
     deckOfCards.add(new Card("8", "D"));
     deckOfCards.add(new Card("9", "D"));
     deckOfCards.add(new Card("10", "D"));
     deckOfCards.add(new Card("J", "D"));
     deckOfCards.add(new Card("Q", "D"));
     deckOfCards.add(new Card("K", "D"));
     deckOfCards.add(new Card("A", "D"));

  }

 void shuffle(){
    for (int i = 0; i < 2*cardsLeft(); i++){
      int random1 = (int)(Math.random()*cardsLeft());
      int random2 = (int)(Math.random()*cardsLeft());
      if(random1 != random2){
      Card temp = getCard(random1);
      insertCard(random1, getCard(random2));
      insertCard(random2, temp);
      }

    }


  }

void printAll(){
  for (int a = 0; a < cardsLeft(); a++){
    System.out.println(getCard(a));
  }
}

int cardsLeft(){
  return deckOfCards.size();
}


Card getCard(int cardIndex){
  return (Card) deckOfCards.get(cardIndex);
}

void insertCard(int cardIndex, Card newCard){
  deckOfCards.set(cardIndex, newCard);
}

Card topCard(){
  return deckOfCards.remove(0);
}





}