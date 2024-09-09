//Did everything exept the money 


//Wins and rounds and win % needs to be done


//COLORS
/*
  "\u001B[32m" + "" + "\u001B[37m";   green
  "\u001B[33m" + "" + "\u001B[37m";   yellow
  "\u001B[34m" + "" + "\u001B[37m";   blue
  "\u001B[35m" + "" + "\u001B[37m";   purple
  "\033[1;30m"+ "" + "\u001B[37m";    black
*/


import java.util.Scanner;
import java.util.*;

public class Main {

 //yo wtf stop typing like this
 //you're actually fat 
  static public int money = 200; //dollaws!
  static public int wins = 0; //wiws
  static public int rounds = 0; //wounds 

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    //STARTING GAME----------------------------------
    Player ayyoub =new Player();
    DealerHand berk=new DealerHand();
    Deck deck=new Deck();
    
    deck.shuffle();
    String thingy="";
    /*Card temp1=new Card("6","H");
    Card temp2=new Card("8","C");
    Card temp3=new Card("2","S");
    Card temp4=new Card("K","S");

    ayyoub.addCard(temp1,0);
    ayyoub.addCard(temp2,0);
    //berk.addCard(temp1);
   // ayyoub.addCard(temp3,0);
    
    System.out.println(ayyoub.getHand(0).getHandValue());
    String it=kb.next();*/
    
    //-----------------------------------------------------
String answer="";
  while (money < 400 && money >= 10){ //ALL THE GAMES------
   
    

    berk.addCard(deck.topCard()); 
  
    berk.addCard(deck.topCard());
    
    ayyoub.addCard(deck.topCard(),0);
    
    ayyoub.addCard(deck.topCard(),0);
    
    
    clear();
      
      System.out.println("You have $"+money+" left");
      System.out.println("NEW GAME, 10 dollery doos");
      money-=10;
      System.out.println(money+" :(");
    
      thingy=kb.next();
       
    System.out.println("\n"+"Dealer:");
    berk.showHand();

boolean playerPlaying=true;
int handsDone=0;
//ONE SINGLE GAME-----------------------------------------
  while(playerPlaying){ //PLAYER PLAYING ONE GAME
    for (int a = 0; a < ayyoub.numHands(); a++){
      if(ayyoub.getStand(a)==0){
        continue;
      }
      
      System.out.println("\n"+"Hand number "+a);
      ayyoub.getHand(a).showHand();
      System.out.println("\u001B[34m" + "Value: "+ayyoub.getHand(a).getHandValue() + "\u001B[37m");

      
     if(ayyoub.splitCheck(a)){ 
        System.out.println("Do you want to split this hand? 'Yes' or 'no'");
       
       answer=kb.next();
       
       if(money==0){
         System.out.println("Just kidding you can't because you're poor");
       } //maybe fix????
       else{
         if(answer.equalsIgnoreCase("yes")){
            ayyoub.spit(a);
           money-=10;
            break;
          }
       }
    }

    System.out.println("\n"+"Stand, Hit, or Double: ");

      answer = kb.next(); 
      if (answer.equalsIgnoreCase("Stand")){
        ayyoub.playerStood(a);
      }

      if (answer.equalsIgnoreCase("Hit")){
        ayyoub.addCard(deck.topCard(),a);
        
        if(ayyoub.busted(a)){
          System.out.println("\n"+"\u001B[31m"+"BUST"+"\u001B[37m"+" (Type to continue)");
          ayyoub.getHand(a).showHand();
          System.out.print("\n");
          thingy=kb.next();
        }
      }

      if(answer.equalsIgnoreCase("Double")){
          if(money==0){
            System.out.println("Nice try poor boy");
          }
          else{
            money-=10;
            ayyoub.setBet(20, a);
            //normal hit stuff-----------------------------
            ayyoub.addCard(deck.topCard(),a);
            
            if(ayyoub.busted(a)){
              System.out.println("\n"+"\u001B[31m"+"BUST"+"\u001B[37m"+" (Type to continue)");
              ayyoub.getHand(a).showHand();
              System.out.print("\n");
              thingy=kb.next();
            }
            //-----------------------------------------
            ayyoub.playerStood(a);
          }
        
      }
      

    }

    for(Integer x:ayyoub.getStands()){
      if(x==0){
        handsDone++;
      }
      if(handsDone==ayyoub.numHands()){
        playerPlaying=false;
      }
    }
    
    
  }

  while(berk.canHit()){ //Dealer drawing till hes good
    berk.addCard(deck.topCard());
    
  }

  System.out.println("\n");
  System.out.println("Dealer:");
  berk.showFullHand();
    
//System.out.println("\u001B[34m" + "Value: "+berk.getHandValue() + "\u001B[37m");
  //prints out the value of dealer's hand
    
  for(int a=0; a<ayyoub.numHands();a++){
    System.out.println("\n"+"Player Hand Number "+a);
    if(ayyoub.busted(a)){
      System.out.println("\u001B[31m" + "Busted" + "\u001B[37m");
    }
    else if(berk.bust()){
      System.out.println("\u001B[32m"+"Dealer Busted woohoo!"+ "\u001B[37m");
      money+=(ayyoub.getBet(a)*2);
      wins++;
    }
    else if(ayyoub.getHand(a).getHandValue()==berk.getHandValue()){
      System.out.println("PUSH");
      money+=(ayyoub.getBet(a)*1);
    }
    else if(ayyoub.getHand(a).getHandValue()>berk.getHandValue()){
      System.out.println("\u001B[32m" + "Player Hand Won" + "\u001B[37m");
      money+=(ayyoub.getBet(a)*2);
      wins++;
    }
    else{
      System.out.println("\u001B[31m" + "You suck :(" + "\u001B[37m");
    }
  }

    rounds++;
System.out.println("Type anything to continue to the next game");
    thingy=kb.next();
    
    berk.reset();
    ayyoub.resetP();
    Deck it=new Deck();
    it.shuffle();
    deck=it;
  } 



double winP=wins/(double)rounds;
System.out.println("win percentace "+winP);




    
  }//MAIN 1
  
  static void clear(){
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
  }

  /*static void checkDeck(Deck x){
    if(x.cardsLeft()==0){
      x=new Deck();
      x.shuffle();
    }
  }*/

  
}//MAIN 2