import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by danries on 2/21/17.
 */
public class Solution {

    int counter = 0;

    public int answer(Integer[] numbers){
        ArrayList<Integer> alreadyTalkedTo = new ArrayList<Integer>();
        alreadyTalkedTo.add(0);
        for (Integer pirate : numbers){
            if (!alreadyTalkedTo.contains(pirate)){
                counter++;
                alreadyTalkedTo.add(pirate);
            }
        }
        if (counter < 2){
            counter = 2;
        }
        return counter;
    }

}
