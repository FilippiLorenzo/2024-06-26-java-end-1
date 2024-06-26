package EX6;


 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 
 public class Hotel {
     private List<Camera> camereDisponibili;
     private Map<Cliente, Prenotazione> prenotazioni;
 
     public Hotel() {
         camereDisponibili = new ArrayList<>();
         prenotazioni = new HashMap<>();
     }
 
     public void aggiungiCamera(Camera camera) {
         camereDisponibili.add(camera);
     }
 
     public void effettuaPrenotazione(Cliente cliente) throws Exception {
         if (camereDisponibili.isEmpty()) {
             throw new Exception("Non ci sono camere disponibili");
         }
         if (prenotazioni.containsKey(cliente)) {
             throw new Exception("Il cliente ha già una prenotazione");
         }
 
         Camera camera = camereDisponibili.remove(0); // Assegna la prima camera disponibile
         Prenotazione prenotazione = new Prenotazione(camera, cliente);
         prenotazioni.put(cliente, prenotazione);
     }
 
     public void cancellaPrenotazione(Cliente cliente) throws Exception {
         Prenotazione prenotazione = prenotazioni.remove(cliente);
         if (prenotazione == null) {
             throw new Exception("Prenotazione non trovata per il cliente: " + cliente.getNome());
         }
         camereDisponibili.add(prenotazione.getCamera());
     }
 
     public void modificaPrenotazione(Cliente cliente) throws Exception {
         cancellaPrenotazione(cliente);
         effettuaPrenotazione(cliente);
     }
 
     public void stampaPrenotazioni() {
         for (Prenotazione prenotazione : prenotazioni.values()) {
             System.out.println(prenotazione);
         }
     }
 }
 