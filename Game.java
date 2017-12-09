
public class Game {
    private Board board;
    private Rulebook ruleBook;
    private Display display;
    private float blackPoints;
    private float whitePoints;
    
    public Game(int boardSize) {
        this.board = new Board(boardSize);
        this.ruleBook = new Rulebook();
        this.display = new Display(board);
    }    
}
