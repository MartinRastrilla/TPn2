package tpn2;

public class Auto extends Vehiculo{

    public Auto() {
    }

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }    
    
    @Override
    public Double calcularCostoCombustible(int distancia) {
        double costoTotal=0;
        switch (combustible.getTipoCombustible()) {
            case "Diesel":
                costoTotal = 118.8*(7*(distancia/100));
                break;
            case "Super":
                costoTotal = 128.7*(7*(distancia/100));
                break;
            case "Infinia":
                costoTotal = 160.7*(7*(distancia/100));
                break;
            default:
                System.out.println("Flashaste mal locura, pone bien el combustible");
        }
        return costoTotal;
    }
    
}
