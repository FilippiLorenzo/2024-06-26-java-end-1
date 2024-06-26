package EX3;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Depositati " + importo + " euro");
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevati " + importo + " euro");
        } else { 
            System.out.println("Errore: Non puoi prelevare " + importo + " è più di quanto hai disponibile.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
