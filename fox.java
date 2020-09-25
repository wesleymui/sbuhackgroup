/* ##Puzzle Description

Consider five holes in a line. One of them is occupied by a fox.
Each night, the fox moves to a neighboring hole, either to the left
or to the right. Each morning, you get to inspect a hole of your choice.
What strategy would ensure that the fox is eventually caught?

##Instructions Click on a hole to select it for inspection.
The fox plays optimally by keeping track of all possible states he
could be in based on your selections so far. You win if he has no where
left to hide. If you give up, click the button and one possible path the f
ox could have taken to avoid your inspections will be shown */

import java.util.Scanner;
import java.util.Arrays;

public class Fox {
  private int foxHole;
  private ArrayList<String> arr = new ArrayList(5);
  private int userMove;
  private int location;

  /*Constructor that creates the fox object, takes name of fox and initial
  location as parameters */
  public Fox(String foxHole, int location) {
    this.foxHole = foxHole;
    arr.add(location, foxHole);
  }

  public int getHoles() {
    return arr.size();
  }
  //Method for fox to move either left or right
  public void move() {
    //conditions if fox is on the left/rightmost hole
    if(arr.indexOf(foxHole) == arr.size() - 1) {
      arr.remove(foxHole);
      arr.add(arr.size() - 2, foxHole);
    } else if(arr.indexOf(foxHole) == 0) {
      arr.remove(foxHole);
      arr.add(1, foxHole);
    }
    int random = (int)(Math.random() * 2);
    //If random is 0, fox moves left, else it moves right.
    if (random == 0) {
      arr.add(arr.indexOf(foxHole) - 1, foxHole);
      arr.remove(arr.lastIndexOf(foxHole));
    }
    else {
      arr.add(arr.indexOf(foxHole) + 1, foxHole);
      arr.remove(arr.indexOf(foxHole));
    }
  }

  //Checks if the users move is the location of the fox
  public boolean isCaught(int userMove) {
    if(userMove == arr.indexOf(foxHole) - 1) {
      return true;
    }
    return false;
  }
}
