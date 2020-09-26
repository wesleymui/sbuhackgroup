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

import java.util.ArrayList;
import java.util.Random;

public class Fox {
    private String foxName;
    //foxHoleLocation represents hole number, 0 is leftmost, 4 is rightmost
    private int foxHoleLocation;
    private ArrayList<Integer> foxHistory = new ArrayList<Integer>();

    /*Constructor that creates the fox object, takes name of fox and initial
    location as parameters */
    public Fox(String foxName, int location) {
        this.foxName = foxName;
        foxHoleLocation = location;
        foxHistory.add(location);
    }

    public String getFoxName(){
        return foxName;
    }

    public int getFoxHoleLocation() {
        return foxHoleLocation;
    }

    public ArrayList<Integer> getFoxHistory(){
        return foxHistory;
    }


    //Method for fox to move
    public void move()
    {
        Random random = new Random();

        //conditions if fox is on the left/rightmost hole
        if (foxHoleLocation == 0)
            foxHoleLocation++;
        else if (foxHoleLocation == 4)
            foxHoleLocation--;
            //if fox is in middle
        else
        {
            //randomly chooses 0 or 1
            if (random.nextInt(2) == 0)
                foxHoleLocation--;
            else
                foxHoleLocation++;
        }
        foxHistory.add(foxHoleLocation);
    }

    //Checks if input userMove is equal to fox's location
    public boolean isCaught(int userMove)
    {
        if(userMove == foxHoleLocation)
            return true;
        return false;
    }
}
