
public class Board {
    private Stone[][] grid;

    /** @param size passed from Game object */
    public Board(int size) {
        grid = new Stone[size][size];
    }
    
    /** Move is legal, place a stone in our grid
      * @param 
      */
    public void placeStone(Stone stone, int row, int column) {
        grid[row][column] = stone;
    }
    
    public void captureStone(Stone stone) {
        grid[stone.getRow()][stone.getColumn()] = null;
    }
    
}
