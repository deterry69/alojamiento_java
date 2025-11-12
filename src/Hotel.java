public class Hotel extends Alojamiento {
    private int estrellas;
    private boolean desayunoIncluido;

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas, boolean desayunoIncluido) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = false;
    }

    public Hotel(int estrellas, boolean desayunoIncluido) {
        this.estrellas = estrellas;
        this.desayunoIncluido = false;
    }

    public Hotel() {
    }

    public int estrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public boolean desayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }
    @Override
    public String toString() {

        return nombre() + ", en " + ciudad() + "(hotel de " + estrellas() + " estrellas)";
    }
}
