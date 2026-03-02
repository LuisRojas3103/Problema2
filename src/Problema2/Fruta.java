package Problema2;
import java.util.ArrayList;
import java.util.List;

public class Fruta {
    private String nombre;
    private float numeroDeHectareas;
    private float precioVenta;
    private float costoProduccion;
    private List<PeriodosCosecha> periodos;

    public Fruta(String nombre, float numeroDeHectareas, float precioVenta, float costoProduccion) {
        this.nombre = nombre;
        this.numeroDeHectareas = numeroDeHectareas;
        this.precioVenta = precioVenta;
        this.costoProduccion = costoProduccion;
        this.periodos = new ArrayList<>();
    }


    public void agregarPeriodo(String tiempoDeCosecha, float cantidadDeCosecha) {
        PeriodosCosecha nuevoPeriodo = new PeriodosCosecha(tiempoDeCosecha, cantidadDeCosecha);
        this.periodos.add(nuevoPeriodo);
    }

    public void eliminarPeriodo(String tiempoDeCosecha) {
        this.periodos.removeIf(p -> p.obtenerTiempoDeCosecha().equalsIgnoreCase(tiempoDeCosecha));
    }

    public float obtenerCostoTotalPeriodo(PeriodosCosecha p) {
        return this.numeroDeHectareas * p.obtenerCantidadEstimada() * this.costoProduccion;
    }

    public float obtenerGananciaEstimada(PeriodosCosecha p) {
        float produccionTotal = this.numeroDeHectareas * p.obtenerCantidadEstimada();
        float margenGanancia = this.precioVenta - this.costoProduccion;
        return produccionTotal * margenGanancia;
    }


    public String obtenerNombre() { return nombre; }
    public float obtenerNumeroDeHectareas() { return numeroDeHectareas; }
    public float obtenerPrecioVenta() { return precioVenta; }
    public float obtenerCostoProduccion() { return costoProduccion; }
    public List<PeriodosCosecha> obtenerPeriodos() { return periodos; }

    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeHectareas=" + numeroDeHectareas +
                ", precioVenta=" + precioVenta +
                ", costoProduccion=" + costoProduccion +
                ", periodos=" + periodos +
                '}';
    }
}