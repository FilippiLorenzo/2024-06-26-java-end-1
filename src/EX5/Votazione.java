package EX5;

import java.util.HashMap;
import java.util.Map;

public class Votazione {
    private Map<Candidato, Integer> voti;
    private Map<String, Boolean> elettori;

    public Votazione() {
        this.voti = new HashMap<>();
        this.elettori = new HashMap<>();
    }

    public void aggiungiCandidato(Candidato candidato) {
        voti.putIfAbsent(candidato, 0);
    }

    public void aggiungiElettore(Elettore elettore) {
        elettori.putIfAbsent(elettore.getNome(), false);
    }

    public void vota(Elettore elettore, Candidato candidato) throws Exception {
        if (!voti.containsKey(candidato)) {
            throw new Exception("Candidato non esistente: " + candidato.getNome());
        }
        if (elettori.get(elettore.getNome())) {
            throw new Exception("L'elettore " + elettore.getNome() + " ha già votato.");
        }

        voti.put(candidato, voti.get(candidato) + 1);
        elettori.put(elettore.getNome(), true);
    }

    public void stampaRisultati() {
        for (Map.Entry<Candidato, Integer> entry : voti.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " voti");
        }
    }
}
