package EX4;

/*
 *  * ES4: Elenco Telefonico
 * 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
 */

 public class Ex4 {
    public static void main(String[] args) {
        ElencoTelefonico elenco = new ElencoTelefonico();

        Contatto contatto1 = new Contatto("Lorenzo Filippi", "1234567890");
        Contatto contatto2 = new Contatto("Marco Cecchi", "9876543210");

        elenco.aggiungiContatto(contatto1);
        elenco.aggiungiContatto(contatto2);

        String nomeDaCercare1 = "Lorenzo Filippi";
        Contatto trovato1 = elenco.cercaContatto(nomeDaCercare1);
        if (trovato1 != null) {
            System.out.println("Numero di telefono di " + nomeDaCercare1 + ": " + trovato1.getNumeroTelefono());
        } else {
            System.out.println("Contatto non trovato per il nome: " + nomeDaCercare1);
        }

        String nomeDaCercare2 = "Lorenzo Marchi";
        Contatto trovato2 = elenco.cercaContatto(nomeDaCercare2);
        if (trovato2 != null) {
            System.out.println("Numero di telefono di " + nomeDaCercare2 + ": " + trovato2.getNumeroTelefono());
        } else {
            System.out.println("Contatto non trovato per il nome: " + nomeDaCercare2);
        }

        String nomeDaRimuovere = "Marco Cecchi";
        elenco.rimuoviContatto(nomeDaRimuovere);
        System.out.println("Contatto rimosso: " + nomeDaRimuovere);

        Contatto contatto3 = new Contatto("Anna Minestroni", "12345");
        elenco.aggiungiContatto(contatto3);

        Contatto contatto4 = new Contatto("Gianfranco Pizzibaldi", "5555666677");
        elenco.aggiungiContatto(contatto4);
        if (elenco.aggiungiContatto(contatto4)) {
            System.out.println("Contatto " + contatto4.getNome() + " aggiunto all'elenco con successo.");
            
            
        }
    }
}
