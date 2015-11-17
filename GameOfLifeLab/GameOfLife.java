import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.Scanner;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 21 rows and 20 columns
    private final int ROWS = 21;
    private final int COLS = 20;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 6, Y1 = 6;
        final int X2 = 13, Y2 = 6;
        final int X3 = 7, Y3 = 7;
        final int X4 = 12, Y4 = 7;
        final int X5 = 8, Y5 = 8;
        final int X6 = 11, Y6 = 8;
        final int X7 = 7, Y7 = 9;
        final int X8 = 8, Y8 = 9;
        final int X9 = 9, Y9 = 9;
        final int X10 = 10, Y10 = 9;
        final int X11 = 11, Y11 = 9;
        final int X12 = 12, Y12 = 9;
        final int X13 = 6, Y13 = 10;
        final int X14 = 13, Y14 = 10;
        final int X15 = 7, Y15 = 11;
        final int X16 = 8, Y16 = 11;
        final int X17 = 9, Y17 = 11;
        final int X18 = 10, Y18 = 11;
        final int X19 = 11, Y19 = 11;
        final int X20 = 12, Y20 = 11;
        final int X21 = 8, Y21 = 12;
        final int X22 = 11, Y22 = 12;
        final int X23 = 7, Y23 = 13;
        final int X24 = 12, Y24 = 13;
        final int X25 = 6, Y25 = 14;
        final int X26 = 13, Y26 = 14;

        //Int[] xArray;
        //xArray = new Int[26];
        //xArray[0] = 
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add cells (a type of Actor) to the three intial locations
        Cell cell1 = new Cell();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, cell1);
        
        Cell cell2 = new Cell();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, cell2);
        
        Cell cell3 = new Cell();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, cell3);
        
        Cell cell4 = new Cell();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, cell4);
        
        Cell cell5 = new Cell();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, cell5);
        
        Cell cell6 = new Cell();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, cell6);
        
        Cell cell7= new Cell();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, cell7);
        
        Cell cell8 = new Cell();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, cell8);
        
        Cell cell9 = new Cell();
        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, cell9);
        
        Cell cell10 = new Cell();
        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, cell10);
        
        Cell cell11 = new Cell();
        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, cell11);
        
        Cell cell12 = new Cell();
        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, cell12);
        
        Cell cell13 = new Cell();
        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, cell13);
        
        Cell cell14 = new Cell();
        Location loc14 = new Location(Y14, X14);
        grid.put(loc14, cell14);
        
        Cell cell15 = new Cell();
        Location loc15 = new Location(Y15, X15);
        grid.put(loc15, cell15);
        
        Cell cell16 = new Cell();
        Location loc16 = new Location(Y16, X16);
        grid.put(loc16, cell16);
        
        Cell cell17 = new Cell();
        Location loc17 = new Location(Y17, X17);
        grid.put(loc17, cell17);
        
        Cell cell18 = new Cell();
        Location loc18 = new Location(Y18, X18);
        grid.put(loc18, cell18);
        
        Cell cell19 = new Cell();
        Location loc19 = new Location(Y19, X19);
        grid.put(loc19, cell19);
        
        Cell cell20 = new Cell();
        Location loc20 = new Location(Y20, X20);
        grid.put(loc20, cell20);
        
        Cell cell21 = new Cell();
        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, cell21);
        
        Cell cell22 = new Cell();
        Location loc22 = new Location(Y22, X22);
        grid.put(loc22, cell22);
        
        Cell cell23 = new Cell();
        Location loc23 = new Location(Y23, X23);
        grid.put(loc23, cell23);
        
        Cell cell24 = new Cell();
        Location loc24 = new Location(Y24, X24);
        grid.put(loc24, cell24);
        
        Cell cell25 = new Cell();
        Location loc25 = new Location(Y25, X25);
        grid.put(loc25, cell25);
        
        Cell cell26 = new Cell();
        Location loc26 = new Location(Y26, X26);
        grid.put(loc26, cell26);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> gridNew = new BoundedGrid<Actor>(ROWS, COLS);
            for (int row = 0; row <= 20; row ++)
            {
                for (int column = 0; column <= 19; column++)
                {
                    Location loc = new Location(row, column);
                    Cell cellNew = new Cell();
                    if (this.getActor(row, column) == null)
                    {
                      int neighbors = (grid.getOccupiedAdjacentLocations(loc)).size();
                      if (neighbors ==3)
                      {
                          gridNew.put(loc, cellNew);
                      }
                    }
                    else
                    {
                      int neighbors = (grid.getOccupiedAdjacentLocations(loc)).size();
                      if (neighbors == 2 || neighbors == 3)
                      {
                          gridNew.put(loc, cellNew);
                      }
                    }
                }
            }
        world.setGrid(gridNew);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        
        Scanner s = new Scanner(System.in);
        System.out.print("How many new generations would you like to see? ");
        int generations = s.nextInt();
        
        for (int i = 1; i <= generations; i++)
        {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {}
            game.createNextGeneration();
        }

    }
}
