package EX6;

public class Camera {
    private int numero;

    public Camera(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Camera " + numero;
    }
}
