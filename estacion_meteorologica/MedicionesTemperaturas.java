import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Double> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *  - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Double>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(double nuevaTemperatura) {
        // Consider newTemp to be greater than or equal to zero k
        assert nuevaTemperatura >= -273.15;
    
        registros.add(new Double(nuevaTemperatura));
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Double temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }
    
    public int cantTemperaturasExtremas () {
        int cant = 0;

        for (Double t : registros) {
            if (t < 15 || t > 35) {
                cant++;
            }
        }

        return cant;
    }
    
    public double getMean () {
        // O(n) traversing to calculate mean
        double mean = 0;
        
        for (double t: registros) {
            mean += t;
        }
        
        return mean / registros.size();
    }
    
    public double getMaxTemperature () {
        // O(n) search for max element
        assert registros.size() > 0;

        double tMax = -1000;
        
        for (double t: registros) {
            if (t > tMax) {
                tMax = t;
            }
        }
        
        return tMax;
    }
    
    public double getMinTemperature () {
        // O(n) search for min element
        assert registros.size() > 0;
        
        double tMin = 10000;
        
        for (double t: registros) {
            if (t < tMin) {
                tMin = t;
            }
        }
        
        return tMin;
    }
    
    public double getThermalAmplitude () {
        assert registros.size() > 0;
        // Get largest and smallest temperatures
        double minT = this.getMinTemperature();
        double maxT = this.getMaxTemperature();
        
        return maxT - minT;
    }
    
    public int largestSequence () {
        // Sliding window approach to get the largest subsequence of same values
        int counter = 0;
        // Initialize pointers
        int i = 0;
        int j = 0;
        
        // Loop over the entire register
        while (j < registros.size()) {
            // If i, j points at the same value, update counter and keep searching for values
            // Otherwise, move the left pointer until reach the same value as the right one
            if (registros.get(j).doubleValue() == registros.get(i).doubleValue()) {
                counter = Math.max(counter, j - i + 1);
                j++;
            } else {
                i++;
            }
        }
        
        return counter;
    }
    
}
