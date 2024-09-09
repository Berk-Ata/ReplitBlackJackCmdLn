

class Card{

  private String suit;
  private String kind;

  Card(String a, String b){
    kind = a;
    suit = b;
  }

  //added now
  String getKind(){
    return kind;
  }

  Boolean isFaceCard()
  {
    if (kind.equals("J") || kind.equals("Q") || kind.equals("K"))
    return true;
    else
    return false;
  }

  Boolean isAce()
  {
    if (kind.equals("A"))
    return true;
    else
    return false;
 }


  int value(){
    if (kind.equals("J") || kind.equals("Q") || kind.equals("K"))
      return 10;
    if(kind.equals("A"))
      return 11;
    return Integer.parseInt(kind);
  }

public String toString(){
  return (kind + " of " + suit);
}


}