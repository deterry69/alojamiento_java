public class Alojamiento {
    private String nombre;
    private double precioPorNoche;
    private String ciudad;

    public Alojamiento(String nombre, double precioPorNoche, String ciudad) {
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
        this.ciudad = ciudad;
    }

    public Alojamiento() {
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double precioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String ciudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public double calcularPrecioPorNoche() {
        return precioPorNoche * 3;
    }

    @Override
    public String toString() {
        return nombre + ", en" + ciudad;
    }
}
