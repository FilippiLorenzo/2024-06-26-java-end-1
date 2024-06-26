package EX2;

/*
 *  ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 */

 import java.util.Scanner;

 public class Ex2 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
        
         Studente studente = new Studente("Lorenzo Filippi", "A123");
 
        
         try {
             studente.aggiungiVoto(21);
             studente.aggiungiVoto(5);
             studente.aggiungiVoto(10);
         } catch (IllegalArgumentException e) {
             System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
         }
 
         
         studente.stampaDettagli();
 
         scanner.close();
     }
 }
 