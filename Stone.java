public class Stone {
    private final Color color;
    private int row;
    private int column; 
    
    public Stone(Color color, int row, int column) {
        this.color = color;
        this.row = row;
        this.column = column;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getColumn() {
        return column;
    }
}
