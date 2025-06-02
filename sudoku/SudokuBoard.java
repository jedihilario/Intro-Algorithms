import java.util.Random;
/**
 * Write a description of class SudokuBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SudokuBoard
{
    // instance variables - replace the example below with your own
    private Board board;
    
    private Random randomGenerator;

    /**
     * Constructor for objects of class SudokuBoard
     */
    public SudokuBoard(int n)
    {
        assert n > 0;
    
        board = new Board(n);
        randomGenerator = new Random();
        initialize();
    }
    
    private void initialize () {
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                
            }
        }
    }
}
