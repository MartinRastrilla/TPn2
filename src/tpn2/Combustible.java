package tpn2;


public class Combustible {
    private String tipoCombustible;
    private Double precioCombustible;

    public Combustible() {
    }

    public Combustible(String tipoCombustible, Double precioCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.precioCombustible = precioCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Double getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(Double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }
}
