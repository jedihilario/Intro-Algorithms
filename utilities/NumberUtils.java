
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        assert n > 0;
        if (n == 1) return false;
        
        int divisor = 2;
        
        while (divisor <= n / 2) {
            if (n % divisor == 0) {
                return false;
            }
            
            divisor++;
        }
        
        return true;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        assert n > 0;
        if (n == 1) return true;
        
        int divisor = 2;
        
        while (divisor < n / 2) {
            if (n % divisor == 0) {
                return true;
            }
            
            divisor++;
        }
        
        return false;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     * Aproximacion mediante el algoritmo de Euclides.
     */
    public int maximoComunDivisor(int n, int m) {
        assert 0 < n && 0 < m;
        if (n == m) return n;
        
        int a = (n > m) ? n : m;
        int b = (n > m) ? m : n;
        
        while (a % b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        
        return b;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        assert n > 0 && m > 0;
        
        int a = (n > m) ? n : m;
        int s = a;
        
        while (a % n != 0 || a % m != 0) {
            a += s;
        }
        
        return a;
    }
    
    /**
     * Calcula los divisores de un número.
     */
    public ArrayList<Integer> divisores(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                div.add(i);
            }
        }
        
        return div;
    }
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        assert n > 0;
    
        int[] nthPrimes = new int[n];
        int c = 0;
        int i = 2;
        
        while (c < n) {
            if (this.esPrimo(i)) {
                nthPrimes[c] = i;
                c++;
            }
            
            i++;
        }
        
        return nthPrimes;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        assert n > 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        
        int first = 1;
        int second = 1;
        int c = 2;
        
        while (c < n) {
            int t = second;
            second = first + second;
            first = t;
            c++;
        }
        
        return second;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        assert n > 0;
        
        ArrayList<Integer> digits = new ArrayList<>();
        
        while (n > 0) {
            digits.add(0, n % 10);
            n /= 10;
        }
        return digits;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        assert arreglo != null;
        assert arreglo.length > 0;
        
        float min = arreglo[0];
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < min) min = arreglo[i];
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
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) max = arreglo[i];
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
        
        for (int i = 0; i < arreglo.length; i++) {
            sum += arreglo[i];
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
        int s = 0;
        
        for (int i = 1; i < n; i++) {
            fib[i] = fib[i - 1] + s;
            s = fib[i - 1];
        }
        
        return fib;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        assert arreglo != null;
        
        for (int j = arreglo.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arreglo[i] > arreglo[j]) {
                    float t = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = t;
                }
            }
        }
        
        if (arreglo.length % 2 == 1) return arreglo[(arreglo.length - 1) / 2];
        
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
