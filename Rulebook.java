import java.util.ArrayList;

public class Rulebook {
    
    public boolean passes(Board board, Stone stone) {
        return koPasses(board, stone) && suicidePasses(board, stone);
    }
    
    public boolean koPasses(Board board, Stone stone) {
      //if passes { return true; }
        
        return false;
    }
    
    public boolean suicidePasses(Board board, Stone stone) {
        //if passes { return true; }
        
        return false;
    }
    
    public ArrayList<Stone> getPrisoners(Board board, Stone stone) {
        ArrayList<Stone> captured = new ArrayList<Stone>();
        //add captured stones to captured ArrayList

        return captured;
    }
    
}
