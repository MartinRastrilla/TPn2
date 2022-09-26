package tpn2;


public class TPn2 {

    public static void main(String[] args) {
        Combustible diesel = new Combustible("Diesel", 118.8);
        Auto auto = new Auto("Ford", "AB123098CD", diesel);
        Ciudad ciudadOrigen = new Ciudad("Yupanqui", 3200, "Atahualpa");
        Ciudad ciudadDestino = new Ciudad("Yupanqui", 2800, "San Camote");
        Viaje viaje1 = new Viaje(3, ciudadOrigen, auto, ciudadDestino);
        viaje1.calculoDistancia();
        System.out.println(viaje1.getDistancia());
        System.out.println("El costo del combustible es:"+viaje1.costoCombustible());
        System.out.println("El costo del peaje es:"+viaje1.costoPeajes());
        System.out.println("El costo total es:"+viaje1.costoTotal());
    }

}
