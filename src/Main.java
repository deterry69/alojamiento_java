public class Main {
    public static void main(String[] args) {

        Alojamiento alojamiento1 = new Alojamiento("Hostal Sol", 50.0, "Madrid");
        System.out.println(alojamiento1.toString());
        System.out.println("Precio total por 3 noches: " + alojamiento1.calcularPrecioPorNoche());
        System.out.println();

        Hotel hotel1 = new Hotel("Gran Hotel", 120.0, "Barcelona", 5, true);
        hotel1.setDesayunoIncluido(false);
        System.out.println(hotel1.toString());
        System.out.println("Precio por noche: " + hotel1.precioPorNoche());
        System.out.println("¿Desayuno incluido? " + hotel1.desayunoIncluido());
        System.out.println("Precio total por 3 noches: " + (hotel1.precioPorNoche() * 3));
        System.out.println();

        Camping camping1 = new Camping(5, 20, true);
        camping1.setNombre("Camping Verde");
        camping1.setCiudad("Granada");
        System.out.println(camping1.toString());
        System.out.println("Capacidad restante: " + camping1.getCapacidadRestante());
        System.out.println("¿Tiene piscina? " + camping1.tienePiscina());
    }
}


