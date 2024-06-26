package EX1;

import java.util.Arrays;
import java.util.Scanner;

public class Prenotazione {
    private boolean[] posti;

    public Prenotazione(int numeroDiPosti) {
        this.posti = new boolean[numeroDiPosti];
    }

    public boolean prenotaPosto(int posto) {
        checkValidPosto(posto);
        if (!posti[posto]) {
            posti[posto] = true;
            return true;
        }
        return false;
    }

    public boolean annullaPrenotazione(int posto) {
        checkValidPosto(posto);
        if (posti[posto]) {
            posti[posto] = false;
            return true;
        }
        return false;
    }

    public boolean verificaDisponibilita(int posto) {
        checkValidPosto(posto);
        return !posti[posto];
    }

    public boolean[] verificaDisponibilita() {
        return Arrays.copyOf(posti, posti.length);
    }

    public void stampaStatoPrenotazioni() {
        System.out.println("Stato attuale delle prenotazioni:");
        for (int i = 0; i < posti.length; i++) {
            System.out.println("Posto " + i + ": " + (posti[i] ? "Prenotato" : "Libero"));
        }
    }

    private void checkValidPosto(int posto) {
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido");
        }
    }

    public static void main(String[] args) {
        Prenotazione teatro = new Prenotazione(10); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Prenota un posto");
            System.out.println("2. Annulla la prenotazione di un posto");
            System.out.println("3. Verifica disponibilita di un posto");
            System.out.println("4. Verifica disponibilita di tutti i posti");
            System.out.println("5. Stampare lo stato attuale delle prenotazioni");
            System.out.println("0. Esci");

            System.out.print("\nScelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il numero del posto da prenotare (0-9): ");
                    int postoDaPrenotare = scanner.nextInt();
                    try {
                        if (teatro.prenotaPosto(postoDaPrenotare)) {
                            System.out.println("Prenotazione effettuata con successo per il posto " + postoDaPrenotare);
                        } else {
                            System.out.println("Il posto " + postoDaPrenotare + " è già prenotato.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Inserisci il numero del posto da annullare (0-9): ");
                    int postoDaAnnullare = scanner.nextInt();
                    try {
                        if (teatro.annullaPrenotazione(postoDaAnnullare)) {
                            System.out.println("Annullamento della prenotazione effettuato con successo per il posto " + postoDaAnnullare);
                        } else {
                            System.out.println("Il posto " + postoDaAnnullare + " non era prenotato.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Inserisci il numero del posto da verificare (0-9): ");
                    int postoDaVerificare = scanner.nextInt();
                    try {
                        if (teatro.verificaDisponibilita(postoDaVerificare)) {
                            System.out.println("Il posto " + postoDaVerificare + " è disponibile.");
                        } else {
                            System.out.println("Il posto " + postoDaVerificare + " è già prenotato.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 4:
                    boolean[] disponibilita = teatro.verificaDisponibilita();
                    System.out.println("\nDisponibilita dei posti:");
                    for (int i = 0; i < disponibilita.length; i++) {
                        System.out.println("Posto " + i + ": " + (disponibilita[i] ? "Libero" : "Prenotato"));
                    }
                    break;

                case 5:
                    teatro.stampaStatoPrenotazioni();
                    break;

                case 0:
                    System.out.println("Programma terminato.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
