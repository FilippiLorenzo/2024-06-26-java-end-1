package EX4;

public class Contatto {
    private String nome;
    private String numeroTelefono;

    public Contatto(String nome, String numeroTelefono) {
        this.nome = nome;
        setNumeroTelefono(numeroTelefono);
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        if (numeroTelefono.matches("\\d{10}")) {
            this.numeroTelefono = numeroTelefono;
        } else {
            System.out.println("Errore: Formato numero non valido. Il numero deve essere composto da 10 cifre.");
            this.numeroTelefono = null;
        }
    }
}
