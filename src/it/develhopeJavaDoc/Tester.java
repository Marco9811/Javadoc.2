package it.develhopeJavaDoc;
/**
 * Questa la mia classe main dove stamperò tutti i risultati richiesti.
 *
 * @author Marco Abbondanza
 */
public class Tester {
    /**
     * Tramite il metodo MAIN vado a stampare tutte le richieste poste dall'esercizio
     * richiamando quindi i metodi della classe ArithmeticOperators.
     */
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        ArithmeticOperators.sum();
        ArithmeticOperators.sub();
        ArithmeticOperators.mul();
        ArithmeticOperators.div();
    }
}




