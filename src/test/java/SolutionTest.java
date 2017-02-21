import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by danries on 2/21/17.
 */
public class SolutionTest {

    Solution solution;
    Integer[] piratesTest1;
    Integer[] piratesTest2;
    Integer[] piratesTestBig;

    @Before public void initialize(){
        solution = new Solution();
        piratesTest1 = new Integer[]{1,0};
    }

    @Test
    public void answerTestFor2Pirates(){
        int expected = 2;
        int actual = solution.answer(piratesTest1);
        assertTrue(expected == actual);
    }

    @Before public void addMore(){
        piratesTest2 = new Integer[]{1,2,1};
    }

    @Test
    public void testOtherOutputExpected(){
        int expected = 2;
        int actual = solution.answer(piratesTest2);
        assertTrue(expected == actual);
    }

    @Before public void addABiggerArray(){
        piratesTestBig = new Integer[]{1,3,0,1};
    }

    @Test
    public void testBiggerArraywithZeroIncluded(){
        int expected = 2;
        int actual = solution.answer(piratesTestBig);
        assertTrue(expected == actual);
    }

}
