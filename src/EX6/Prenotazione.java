package EX6;

public class Prenotazione {
    private Camera camera;
    private Cliente cliente;

    public Prenotazione(Camera camera, Cliente cliente) {
        this.camera = camera;
        this.cliente = cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Prenotazione [camera=" + camera + ", cliente=" + cliente + "]";
    }
}

