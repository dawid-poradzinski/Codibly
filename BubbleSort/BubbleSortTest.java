package BubbleSort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {
    BubbleSort bubble = new BubbleSort();
    List<Number> list = new ArrayList<Number>();
    List<Number> answers = new ArrayList<Number>();

    @Test
    public void test0(){

        list = new ArrayList<Number>(Arrays.asList(1,4,5,6,8,3,8));
        answers = new ArrayList<Number>(Arrays.asList(1,3,4,5,6,8,8));
        assertEquals(answers, bubble.sort(list));  

    }

    @Test
    public void test1(){

        list = new ArrayList<Number>(Arrays.asList(-9.3,0.2,4,0.1,5,9));
        answers = new ArrayList<Number>(Arrays.asList(-9.3,0.1,0.2,4,5,9));
        assertEquals(answers, bubble.sort(list)); 

    }

    @Test
    public void test2(){

        list = new ArrayList<Number>(Arrays.asList());
        answers = new ArrayList<Number>(Arrays.asList());
        assertEquals(answers, bubble.sort(list)); 

    }

    @Test
    public void test3(){

        list = new ArrayList<Number>(Arrays.asList(null,5.0001));
        answers = new ArrayList<Number>(Arrays.asList(5.0001));
        assertEquals(answers, bubble.sort(list));  

    }

    @Test
    public void test4(){
        assertThrows(RuntimeException.class, () -> bubble.sort(null));
    }
}
