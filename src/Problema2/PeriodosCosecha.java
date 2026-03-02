package Problema2;
public class PeriodosCosecha {
    private String tiempoDeCosecha;
    private float cantidadDeCosecha;

    public PeriodosCosecha(String tiempoDeCosecha, float cantidadDeCosecha) {
        this.tiempoDeCosecha = tiempoDeCosecha;
        this.cantidadDeCosecha = cantidadDeCosecha;
    }


    public float obtenerCantidadEstimada() {
        return this.cantidadDeCosecha;
    }

    public String obtenerTiempoDeCosecha() {
        return this.tiempoDeCosecha;
    }

    @Override
    public String toString() {
        return "PeriodosCosecha{" +
                "tiempoDeCosecha='" + tiempoDeCosecha + '\'' +
                ", cantidadDeCosecha=" + cantidadDeCosecha +
                '}';
    }
}