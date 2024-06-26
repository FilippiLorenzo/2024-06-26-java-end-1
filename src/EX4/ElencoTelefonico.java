package EX4;

import java.util.ArrayList;

public class ElencoTelefonico {
    private ArrayList<Contatto> elenco;

    public ElencoTelefonico() {
        this.elenco = new ArrayList<>();
    }

    public boolean aggiungiContatto(Contatto contatto) {
        if (contatto.getNumeroTelefono() == null) {
            return false; // Non aggiungere contatti con numero non valido
        }
        elenco.add(contatto);
        return true;
    }

    public void rimuoviContatto(String nome) {
        for (int i = 0; i < elenco.size(); i++) {
            Contatto contatto = elenco.get(i);
            if (contatto.getNome().equals(nome)) {
                elenco.remove(i);
                return; // Rimuovi solo il primo contatto trovato con quel nome
            }
        }
        System.out.println("Contatto non trovato per il nome: " + nome);
    }

    public Contatto cercaContatto(String nome) {
        for (Contatto contatto : elenco) {
            if (contatto.getNome().equals(nome)) {
                return contatto;
            }
        }
        return null; // Se non trova il contatto
    }
}
