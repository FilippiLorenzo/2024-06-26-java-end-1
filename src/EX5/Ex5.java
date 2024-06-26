package EX5;

/*
 *  * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 * 
 */

 public class Ex5 {
    public static void main(String[] args) {
        try {
            
            
            Candidato candidato1 = new Candidato("Alice");
            Candidato candidato2 = new Candidato("Bob");

         
            Elettore elettore1 = new Elettore("Giovanni");
            Elettore elettore2 = new Elettore("Maria");
            Elettore elettore3 = new Elettore("Luca");

         
            Votazione votazione = new Votazione();
            votazione.aggiungiCandidato(candidato1);
            votazione.aggiungiCandidato(candidato2);
            
            votazione.aggiungiElettore(elettore1);
            votazione.aggiungiElettore(elettore2);
            votazione.aggiungiElettore(elettore3);

            
            votazione.vota(elettore1, candidato1);
            votazione.vota(elettore2, candidato2);
            votazione.vota(elettore3, candidato1);

           
            votazione.stampaRisultati();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}


