package EX2;

import java.util.ArrayList;

public class Studente {
    private String nome;
    private String matricola;
    private ArrayList<Integer> voti;

    public Studente(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(int voto) {
        if (voto >= 1 && voto <= 10) {
            voti.add(voto);
        } else {
            voti.add(-1); // Aggiunge un valore speciale per i voti non validi
        }
    }

    public double calcolaMedia() {
        if (voti.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        int count = 0;
        for (int voto : voti) {
            if (voto >= 1 && voto <= 10) {
                sum += voto;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) sum / count;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricola: " + matricola);

        if (voti.isEmpty()) {
            System.out.println("Nessun voto registrato");
        } else {
            System.out.println("Voti:");
            for (int i = 0; i < voti.size(); i++) {
                int voto = voti.get(i);
                if (voto < 0) {
                    System.out.println("Voto " + (i + 1) + ": VOTO NON VALIDO");
                } else {
                    System.out.println("Voto " + (i + 1) + ": " + voto);
                }
            }
            System.out.println("Media dei voti: " + calcolaMedia());
        }
    }
}
