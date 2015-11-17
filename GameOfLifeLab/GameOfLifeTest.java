
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
         *  0  - - - - - - - - - - - - - - - - - - - - 
         *  1  - - - - - - - - - - - - - - - - - - - - 
         *  2  - - - - - - - - - - - - - - - - - - - - 
         *  3  - - - - - - - - - - - - - - - - - - - - 
         *  4  - - - - - - - - - - - - - - - - - - - - 
         *  5  - - - - - - - - - - - - - - - - - - - - 
         *  6  - - - - - - x - - - - - - x - - - - - - 
         *  7  - - - - - - - x - - - - x - - - - - - - 
         *  8  - - - - - - - - x - - x - - - - - - - - 
         *  9  - - - - - - - x x x x x x - - - - - - - 
         *  10 - - - - - - x - - - - - - x - - - - - - 
         *  11 - - - - - - - x x x x x x - - - - - - - 
         *  12 - - - - - - - - x - - x - - - - - - - - 
         *  13 - - - - - - - x - - - - x - - - - - - - 
         *  14 - - - - - - x - - - - - - x - - - - - - 
         *  15 - - - - - - - - - - - - - - - - - - - - 
         *  16 - - - - - - - - - - - - - - - - - - - - 
         *  17 - - - - - - - - - - - - - - - - - - - - 
         *  18 - - - - - - - - - - - - - - - - - - - - 
         *  19 - - - - - - - - - - - - - - - - - - - - 
         *  20 - - - - - - - - - - - - - - - - - - - - 
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 6 && col == 6) ||
                        (row == 6 && col == 13) ||
                        (row == 7 && col == 7) ||
                        (row == 7 && col == 12) ||
                        (row == 8 && col == 8) ||
                        (row == 8 && col == 11) ||
                        (row == 9 && col == 7) ||
                        (row == 9 && col == 8) ||
                        (row == 9 && col == 9) ||
                        (row == 9 && col == 10) ||
                        (row == 9 && col == 11) ||
                        (row == 9 && col == 12) ||
                        (row == 10 && col == 6) ||
                        (row == 10 && col == 13) ||
                        (row == 11 && col == 7) ||
                        (row == 11 && col == 8) ||
                        (row == 11 && col == 9) ||
                        (row == 11 && col == 10) ||
                        (row == 11 && col == 11) ||
                        (row == 11 && col == 12) ||
                        (row == 12 && col == 8) ||
                        (row == 12 && col == 11) ||
                        (row == 13 && col == 7) ||
                        (row == 13 && col == 12) ||
                        (row == 14 && col == 6) ||
                        (row == 14 && col == 13))
                        
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
         *  0  - - - - - - - - - - - - - - - - - - - - 
         *  1  - - - - - - - - - - - - - - - - - - - - 
         *  2  - - - - - - - - - - - - - - - - - - - - 
         *  3  - - - - - - - - - - - - - - - - - - - - 
         *  4  - - - - - - - - - - - - - - - - - - - - 
         *  5  - - - - - - - - - - - - - - - - - - - - 
         *  6  - - - - - - - - - - - - - - - - - - - - 
         *  7  - - - - - - - - - - - - - - - - - - - - 
         *  8  - - - - - - - x - x x - x - - - - - - - 
         *  9  - - - - - - - x x x x x x - - - - - - - 
         *  10 - - - - - - x - - - - - - x - - - - - - 
         *  11 - - - - - - - x x x x x x - - - - - - - 
         *  12 - - - - - - - x - x x - x - - - - - - - 
         *  13 - - - - - - - - - - - - - - - - - - - - 
         *  14 - - - - - - - - - - - - - - - - - - - - 
         *  15 - - - - - - - - - - - - - - - - - - - - 
         *  16 - - - - - - - - - - - - - - - - - - - - 
         *  17 - - - - - - - - - - - - - - - - - - - - 
         *  18 - - - - - - - - - - - - - - - - - - - - 
         *  19 - - - - - - - - - - - - - - - - - - - - 
         *  20 - - - - - - - - - - - - - - - - - - - - 
         */
        GameOfLife game = new GameOfLife();
        game.createNextGeneration();
        game.createNextGeneration();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 8 && col == 7) ||
                        (row == 8 && col == 9) ||
                        (row == 8 && col == 10) ||
                        (row == 8 && col == 12) ||
                        (row == 9 && col == 7) ||
                        (row == 9 && col == 8) ||
                        (row == 9 && col == 9) ||
                        (row == 9 && col == 10) ||
                        (row == 9 && col == 11) ||
                        (row == 9 && col == 12) ||
                        (row == 10 && col == 6) ||
                        (row == 10 && col == 13) ||
                        (row == 11 && col == 7) ||
                        (row == 11 && col == 8) ||
                        (row == 11 && col == 9) ||
                        (row == 11 && col == 10) ||
                        (row == 11 && col == 11) ||
                        (row == 11 && col == 12) ||
                        (row == 12 && col == 7) ||
                        (row == 12 && col == 9) ||
                        (row == 12 && col == 10) ||
                        (row == 12 && col == 12))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

