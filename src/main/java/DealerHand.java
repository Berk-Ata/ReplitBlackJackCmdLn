import java.util.*;
class DealerHand extends Hand{

  
  

  /*DealerHand(){
   super();
  }*/

  public void showHand(){
    System.out.println("Nuh uh of you don't get to see this");
    for(int a=1; a<cards.size();a++){
      System.out.println(cards.get(a));
    }
  } 

  public void showFullHand(){
    for(Card x:cards){
      System.out.println(x);
    }
  }


  public boolean canHit(){
    return(handValue<16||(handValue==16&&aces>0));
  }

  
  
}