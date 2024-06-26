package EX3;

/*
 *  * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 */


public class Ex3 {
    
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(1000.00); 
        
        System.out.println("il saldo del conto è: " + conto.getSaldo() + " euro");
        System.out.println("----------------------------------------------------------");

        // Test di deposito
        conto.deposita(500.0);
        System.out.println("Saldo attuale dopo deposito: " + conto.getSaldo() + " euro");
        System.out.println("----------------------------------------------------------");

        // Test di prelievo con saldo sufficiente
        conto.preleva(700.0);
        System.out.println("Saldo attuale dopo prelievo: " + conto.getSaldo() + " euro");
        System.out.println("----------------------------------------------------------");

        // Test di prelievo con saldo insufficiente
        conto.preleva(1500.0);
        System.out.println("Saldo attuale dopo prelievo: " + conto.getSaldo() + " euro");
        System.out.println("----------------------------------------------------------");
    }
}
