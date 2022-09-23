import java.util.Random;

public class CandyPlayer {

  private static int candies;
  private int selfCandies;

  private static int turn;
  private static int numPlayers = 0;

  private int id;

  public CandyPlayer(int selfCandies){

    this.selfCandies = selfCandies;
    id = numPlayers;
    numPlayers ++;

  }

  public int getMyCandy(){
    return this.selfCandies;
  }

  public static int getMountainCandy(){
    return candies;
  }


  public boolean play(int candy){



    if (this.id != getTurn())
      return false;

    if (candy > this.selfCandies){
      setTurn(getTurn() + 1);
      if (getTurn() == getNumberOfPlayers())
        setTurn(0);
      return false;
    }

    if (candies >= candy){
      this.selfCandies += candy;
      candies = candies - candy;

    }else{
      candies += candy;
      this.selfCandies -= candy;
    }

    setTurn(getTurn() + 1);
    if (getTurn() == getNumberOfPlayers())
      setTurn(0);
    return true;
  }

  public static int getTurn(){
    return turn;
  }

  public static int getNumberOfPlayers(){
    return numPlayers;
  }

  public static void setTurn(int t){
    turn = t;
  }

  public static void setNumberOfPlayers(int players){
    numPlayers = players;
  }

  private static int totalCandy = (new Random()).nextInt(100);
    
    
}