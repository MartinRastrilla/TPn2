package tpn2;


public class Viaje {
    private int distancia;
    private int peajes;
    private Ciudad origen;
    private Vehiculo vehiculo;
    private Ciudad destino;

    public Viaje(int distancia, int peajes, Ciudad origen, Vehiculo vehiculo, Ciudad destino) {
        this.distancia = distancia;
        this.peajes = peajes;
        this.origen = origen;
        this.vehiculo = vehiculo;
        this.destino = destino;
    }

    public Viaje(int peajes, Ciudad origen, Vehiculo vehiculo, Ciudad destino) {
        this.peajes = peajes;
        this.origen = origen;
        this.vehiculo = vehiculo;
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }
    
    public void calculoDistancia(){
        
    }
    
    public double costoPeajes(){
        
    }
    public double costoCombustible(){
            
        }
    public double costoTotal(){
        
    }
}
