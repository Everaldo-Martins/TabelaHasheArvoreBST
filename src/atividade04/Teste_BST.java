package atividade04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Teste_BST {
	private BST bst;

    @Before
    public void setUp() {
        bst = new BST();
    }

    @Test
    public void testInsertAndSearch() throws Exception {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        assertEquals(5, bst.search(5));
        assertEquals(3, bst.search(3));
        assertEquals(7, bst.search(7));
        assertEquals(2, bst.search(2));
        assertEquals(4, bst.search(4));
        assertEquals(6, bst.search(6));
        assertEquals(8, bst.search(8));
    }

    @Test
    public void testPreOrder() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        int[] expected = {5, 3, 2, 4, 7, 6, 8};
        assertArrayEquals(expected, bst.preOrder());
    }

    @Test
    public void testOrder() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        int[] expected = {2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, bst.order());
    }

    @Test
    public void testPostOrder() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        int[] expected = {2, 4, 3, 6, 8, 7, 5};
        assertArrayEquals(expected, bst.postOrder());
    }

    @Test
    public void testIsComplete() {
        bst.insert(8);
        bst.insert(12);       
        bst.insert(14);
        bst.insert(15);
        //Incomplete
        assertFalse(bst.isComplete());
        
        bst.insert(4);
        bst.insert(2);
        bst.insert(1);
        bst.insert(13);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(10);
        bst.insert(9);
        bst.insert(5);
        bst.insert(11);
        //Complete
        assertTrue(bst.isComplete());
    }
}
