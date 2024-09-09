import java.util.*;
class Hand{

  protected ArrayList<Card> cards;
  protected int handValue;
  protected int aces;
  protected int bet;

  Hand(){
    cards=new ArrayList<Card>();
    handValue=0;
    aces=0;
    bet=10;
  }
  
  public void setBet(int x){
    bet=x;
  }
  public int getBet(){
    return bet;
  }
  
  public void reset(){
    handValue=0;
    aces=0;
    bet=10;
    cards=new ArrayList<Card>();
  }
  
  public int getAceCount(){
    return aces;
  }
  
  public boolean bust(){
    return(handValue>21);
  }
  
  public void addCard(Card it){
    if(it.getKind().equals("A")){
      aces++;
    }
    cards.add(it);
    handValue+=it.value();
    if(handValue>21&&aces>0){
      handValue-=10;
      aces--;
    }
  }

  public void showHand(){
    for(Card x : cards){
      System.out.println(x);
    }
  } 

  public int getHandValue(){
    return handValue;
  }
  
public void setHandValue(int value){
  handValue=value;
}
  
  public int getAces(){
    return aces;
  }

  public ArrayList<Card> getCards(){
    return cards;
  }
  public Card getCard(int index){
    return cards.get(index);
  }
  public void increaseAce(){
    aces++;
  }
  public int getSize(){
    return cards.size();
  }













}