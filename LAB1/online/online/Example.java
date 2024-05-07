/**
 * Example
 * Membri Attributi 
 * 
 * Double [] example; // vettore di valori reali
 * 
 * Membri Metodi 
 * 
 * Example (int length) 
 * Input:  dimensione dell’esempio
 * Output: //
 * Comportamento:  inizializza example come vettore di dimensione length
 * 
 * void set(int index, Double v)
 * Input: index: posizione del valore , v: valore 
 * Comportamento:  modifica example inserendo v in posizione index ;
 * 
 * Double get(int index) 
 * Input:  index: posizione di example 
 * Output : valore memorizzato in example[index] 
 * Comportamento:  restituisce example[index]; 
 * 
 * double distance(Example newE) 
 * Input:  newE : istanza di Example 
 * Output:  calcola la distanza euclidea tra this.example e new.example  
 * Comportamento:  restituisce il valore calcolato; 
 * 
 * public String toString()  
 * Input:  newE : istanza di Example 
 * Output:  la stringa che rappresenta il contenuto di example  
 * Comportamento: restituisce la stringa;
 */
public class Example {

    Double[] example;

    Example(int length) {
        example = new Double[length];
    }

    void set(int index, Double v) {
        example[index] = v;
    }

    Double get(int index) {
        return example[index];
    }

    double distance(Example newE) {
        double sum = 0;
        for (int i = 0; i < example.length; i++) {
            sum += Math.pow(example[i] - newE.get(i), 2);
        }
        return Math.sqrt(sum);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < example.length; i++) {
            s += example[i] + " ";
        }
        return s;
    }
}