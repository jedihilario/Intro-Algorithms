
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private int[][] matrix;
    
    private int size;

    /**
     * Initialize a new board with a given size of n.
     * 
     * @param n Size of the board
     */
    public Board(int n)
    {
        assert n > 0;
        
        this.size = n;
        this.matrix = new int[n][n];
        this.autoFill();
    }
    
    private void autoFill () {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.matrix[i][j] = 0;
            }
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    /**
     * Get the matrix representation in its current state.
     * 
     * @return Current matrix.
     */
    public int[][] getBoard() {
        return this.matrix;
    }
    
    public int getSize() {
        return this.size;
    }
    
    /**
     * Set the value in the (i, j) position.
     * 
     * @param i Row position.
     * @param j Column position.
     * @param v New value.
     */
    public void setValue (int i, int j, int v) {
        assert 0 <= i && i < this.size && 0 <= j && j < this.size;
        
        this.matrix[i][j] = v;
    }
}
