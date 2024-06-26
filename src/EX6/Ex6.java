package EX6;

/*
 *  * ES6: Sistema di Prenotazione Hotel
 * 
 * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
 * associare clienti a prenotazioni e una lista di camere disponibili.
 * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
 * assicurandoti di gestire eccezioni come camere non disponibili o
 * cancellazioni tardive.
 */



 public class Ex6 {
    public static void main(String[] args) {
        try {
            // Creazione dell'hotel
            Hotel hotel = new Hotel();

            // Aggiunta di camere
            hotel.aggiungiCamera(new Camera(101));
            hotel.aggiungiCamera(new Camera(102));
            hotel.aggiungiCamera(new Camera(103));

            // Creazione di clienti
            Cliente cliente1 = new Cliente("Alice");
            Cliente cliente2 = new Cliente("Bob");
            Cliente cliente3 = new Cliente("Charlie");

            // Effettuare prenotazioni
            hotel.effettuaPrenotazione(cliente1);
            hotel.effettuaPrenotazione(cliente2);

            // Stampa delle prenotazioni
            System.out.println("Prenotazioni iniziali:");
            hotel.stampaPrenotazioni();

            // Modifica della prenotazione
            System.out.println("\nModifica della prenotazione di Alice:");
            hotel.modificaPrenotazione(cliente1);
            hotel.stampaPrenotazioni();

            // Cancellazione della prenotazione
            System.out.println("\nCancellazione della prenotazione di Bob:");
            hotel.cancellaPrenotazione(cliente2);
            hotel.stampaPrenotazioni();

            // Effettuare un'altra prenotazione
            System.out.println("\nPrenotazione per Charlie:");
            hotel.effettuaPrenotazione(cliente3);
            hotel.stampaPrenotazioni();

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
