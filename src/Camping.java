public class Camping extends Alojamiento{
    private int numCaravanas;
    private int capacidadCaravanas;
    private boolean tienePiscina;

    public Camping(int numCaravanas, int capacidadCaravanas, boolean tienePiscina) {
        this.numCaravanas = numCaravanas;
        this.capacidadCaravanas = capacidadCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public Camping() {
    }

    public int numCaravanas() {
        return numCaravanas;
    }

    public void setNumCaravanas(int numCaravanas) {
        this.numCaravanas = numCaravanas;
    }

    public int capacidadCaravanas() {
        return capacidadCaravanas;
    }

    public void setCapacidadCaravanas(int capacidadCaravanas) {
        this.capacidadCaravanas = capacidadCaravanas;
    }

    public boolean tienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }
    public int getCapacidadRestante() {
        return capacidadCaravanas - numCaravanas;
    }
    @Override
    public String toString() {
        return nombre() + ", en " + ciudad() + "( camping con capacidad para " + capacidadCaravanas + " caravanas)";
    }
    }

