package tpn2;


public class Ciudad {
    private String ruta;
    private int kmRuta;
    private String nombre;

    public Ciudad(String ruta, int kmRuta, String nombre) {
        this.ruta = ruta;
        this.kmRuta = kmRuta;
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
