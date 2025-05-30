
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elem) return true;
        }
        
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        int sum = 0;
        
        for (int i : arreglo) {
            sum += i;
        }
        
        return sum;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        assert arreglo != null;
        assert arreglo.length > 0;
        
        float min = arreglo[0];
        
        for (float i : arreglo) {
            if (i < min) min = i;
        }
        
        return min;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        assert arreglo != null;
        assert arreglo.length > 0;
        
        float max = arreglo[0];
        
        for (float i : arreglo) {
            if (i > max) max = i;
        }
        
        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        assert arreglo != null;
        assert arreglo.length > 0;
        
        float sum = 0;
        for (float n : arreglo) {
            sum += n;
        }
        
        return (float) sum / arreglo.length;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        assert n > 0;
        
        int[] fib = new int[n];
        fib[0] = 1;
        
        if (n > 1) {
            fib[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        assert arreglo != null;
        if (arreglo.length == 0) return 0;
        
        for (int i = arreglo.length - 1; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (arreglo[j] > arreglo[i]) {
                    float t = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = t;
                }
            }
        }
        
        if (arreglo.length % 2 == 1) {
            return arreglo[(arreglo.length - 1) / 2];
        }
        
        return (arreglo[arreglo.length / 2 - 1] + arreglo[arreglo.length / 2]) / 2;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        assert arr1 != null && arr2 != null;
        
        if (arr1.length != arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        assert arreglo != null;
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) return true;
            }
        }
        
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        assert arreglo != null;
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] + arreglo[j] == 0) return true;
            }
        }
        
        return false;
    }
    
}
