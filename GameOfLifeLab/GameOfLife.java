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
        // Arrays for the x and y positions of the cells initially alive

        int[] xArray;
        xArray = new int[26];
            xArray[0] = 6;
            xArray[1] = 13;
            xArray[2] = 7;
            xArray[3] = 12;
            xArray[4] = 8;
            xArray[5] = 11;
            xArray[6] = 7;
            xArray[7] = 8;
            xArray[8] = 9;
            xArray[9] = 10;
            xArray[10] = 11;
            xArray[11] = 12;
            xArray[12] = 6;
            xArray[13] = 13;
            xArray[14] = 7;
            xArray[15] = 8;
            xArray[16] = 9;
            xArray[17] = 10;
            xArray[18] = 11;
            xArray[19] = 12;
            xArray[20] = 8;
            xArray[21] = 11; 
            xArray[22] = 7;
            xArray[23] = 12;
            xArray[24] = 6;
            xArray[25] = 13;
        
        int[] yArray;
        yArray = new int[26];
            yArray[0] = 6;
            yArray[1] = 6;
            yArray[2] = 7;
            yArray[3] = 7;
            yArray[4] = 8;
            yArray[5] = 8;
            yArray[6] = 9;
            yArray[7] = 9;
            yArray[8] = 9;
            yArray[9] = 9;
            yArray[10] = 9;
            yArray[11] = 9;
            yArray[12] = 10;
            yArray[13] = 10;
            yArray[14] = 11;
            yArray[15] = 11;
            yArray[16] = 11;
            yArray[17] = 11;
            yArray[18] = 11;
            yArray[19] = 11;
            yArray[20] = 12;
            yArray[21] = 12;
            yArray[22] = 13;
            yArray[23] = 13;
            yArray[24] = 14;
            yArray[25] = 14;

        // the grid of Actors that maintains the state of the game
        // (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add cells (a type of Actor) to the intial locations
        
        for (int i = 0; i <= 25; i++) //iterates through the arrays for the next x,y coordinate
        {
            Cell cell = new Cell();
            Location loc = new Location(yArray[i], xArray[i]);
            grid.put(loc, cell);
        }
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
