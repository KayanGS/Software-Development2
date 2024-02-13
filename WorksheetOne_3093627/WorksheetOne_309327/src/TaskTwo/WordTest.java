package TaskTwo;

import static org.junit.Assert.*;
import org.junit.Test;


public class WordTest {

    //Declaring arrays and create a Word object that is composed of the chars 
    //in the array
    final char[] LETTERS1 = {'a', 't', 'i', 'f'};
    final Word WORD1 = new Word(LETTERS1);

    final char[] LETTERS2 = {'s', 'd', '2'};
    final Word WORD2 = new Word(LETTERS2);

    final char[] LETTERS3 = {'k', 'a', 'y', 'a', 'n'};
    final Word WORD3 = new Word(LETTERS3);

    @Test
    /**
     * Test if the array contains the symbol
     */
    public void testContains(){
        assertTrue(WORD1.contains('a'));
        assertTrue(WORD2.contains('2'));
        assertTrue(WORD3.contains('y'));
    }

    @Test
    /**
     * Test if the array length is correct
     */
    public void testLength(){
        assertEquals(4, LETTERS1.length);
        assertEquals(3, LETTERS2.length);
        assertEquals(5, LETTERS3.length);
    }

    @Test
    /**
     * Test if the array is not null
     */
    public void testNotNull(){
        assertNotNull(WORD1);
        assertNotNull(WORD2);
        assertNotNull(WORD3);
    }

    
}
