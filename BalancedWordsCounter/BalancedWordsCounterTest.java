package BalancedWordsCounter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BalancedWordsCounterTest {
    
    BalancedWordsCounter counter = new BalancedWordsCounter();

    @Test
    public void test0(){
        assertEquals(28, counter.count("aabbabcccba"));
    }

    @Test
    public void test1(){
        assertEquals(0, counter.count(""));
    }

    @Test
    public void test2(){
        assertThrows(RuntimeException.class, () -> counter.count("abababa1"));
    }

    @Test
    public void test3(){
        assertThrows(RuntimeException.class, () -> counter.count(null));
    }
}
