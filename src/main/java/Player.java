import java.util.Scanner;
import java.util.*;

class Player{  //WE NEVER FINNISHING THE HISTORY ESSAYS WITH THIS ONE

  ArrayList<Integer> stands;
  ArrayList<Hand> hands;

  public void setBet(int x, int index){
    hands.get(index).setBet(x);
  }
  
  public int getBet(int index){
    return hands.get(index).getBet();
  }
  
  public Player(){
    hands=new ArrayList<Hand>();
    stands=new ArrayList<Integer>();
    stands.add(1);
    hands.add(new Hand());
  }

  public void resetP(){ //wrong 
    for(int a=hands.size()-1; a>0;a--){
      hands.remove(a);
    }
    hands.get(0).reset();
    for(int a=stands.size()-1;a>0;a--){
      stands.remove(a);
    }
    stands.set(0,1);
  }

  public void spit(int index){ //all RIGHT because im him
    if(hands.get(index).getCards().size()>2){
      return;
    }
    
if(hands.get(index).getCard(0).getKind().equals(hands.get(index).getCard(1).getKind())){
  
      Card tempC=hands.get(index).getCards().remove(1);
      Hand tempH=new Hand();
  
      tempH.addCard(tempC); //adds it to the temp hand
      hands.add(tempH);//adds new hand into hands
      stands.add(1);
  int temp=hands.get(index).getHandValue();
  
      hands.get(index).setHandValue(temp-tempC.value());
  
    }
  }

//you wrote the double down code inside the split function
  
  //ayyoub doubleD code
  /*  public void DoubleD(int index1){

     int x = hands.get(index1).getHandValue();

      if (x == 11){

        hands.get(index1).add(deck.top());

      }


      }*/

  public int numHands(){
    return hands.size();
  }

  
  public void addCard(Card it, int index){
    hands.get(index).addCard(it);
    if(hands.get(index).getHandValue()>21){
      stands.set(index,0);
    }
  }

  public void showHand(){
    int a=0;
    for(Hand x : hands){
      
      System.out.println("Hand "+a+":");
      x.showHand();
      System.out.println();
      a++;
    }
  } 

  public ArrayList<Hand> getHands(){
    return hands;
  }

  public Hand getHand(int index){
    return hands.get(index);
  }

  public int getStand(int index){
    return stands.get(index);
  }
  
  public ArrayList<Integer> getStands(){
    return stands;
  }

  public void playerStood(int index){
    stands.set(index,0);
  }

  public boolean splitCheck(int index){
    
      return (hands.get(index).getSize()==2 && hands.get(index).getCard(0).getKind().equals(hands.get(index).getCard(1).getKind()));
      
    }

  public boolean busted(int index){
   return( hands.get(index).bust());
  }


  
  }


