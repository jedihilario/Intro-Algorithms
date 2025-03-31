
/**
 * Write a description of class ParOrdenado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParOrdenado
{
    // instance variables - replace the example below with your own
    private int firstComponent;
    private int secondComponent;

    /**
     * Constructor for objects of class ParOrdenado
     */
    public ParOrdenado(int x, int y)
    {
        // initialise instance variables
        this.firstComponent = x;
        this.secondComponent = y;
    }
    
    public int getAbscisse() { return this.firstComponent; }
    
    public int getOrdered () { return this.secondComponent; }
    
    public void setAbscisse (int n) {
        this.firstComponent = n;
    }
    
    public void setOrdered (int n) {
        this.secondComponent = n;
    }
    
    public int getNorm () {
        int a = this.firstComponent * this.firstComponent;
        int b = this.secondComponent * this.secondComponent;
        return (int) Math.sqrt(a + b);
    }
}
