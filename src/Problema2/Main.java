package Problema2;
public class Main {
    public static void main(String[] args) {
        Fruta naranja = new Fruta("Naranja Valencia", 50.0f, 4000.0f, 1500.0f);
        //Creamos un objeto "naranja" y comprobamos el estado inicial del objeto
        System.out.println(naranja.toString());

        //Agregamos los periodos de cosecha al objeto y verificamos el metodo obtener periodos
        naranja.agregarPeriodo("Primavera 2026", 12.5f);
        naranja.agregarPeriodo("Otoño 2026", 8.0f);
        naranja.agregarPeriodo("Invierno 2026", 0.0f);

        System.out.println("Periodos registrados correctamente. Total actual: " + naranja.obtenerPeriodos().size());
        //Probamos loa metodos para calcular las ganancias segun el periodo
        for (PeriodosCosecha periodo : naranja.obtenerPeriodos()) {
            System.out.println("-> Evaluando: " + periodo.obtenerTiempoDeCosecha());

            float costo = naranja.obtenerCostoTotalPeriodo(periodo);
            float ganancia = naranja.obtenerGananciaEstimada(periodo);

            System.out.println("   Rendimiento: " + periodo.obtenerCantidadEstimada() + " ton/ha");
            System.out.println("   Costo Total: $" + costo);
            System.out.println("   Ganancia Estimada: $" + ganancia);
            System.out.println("   -------------------------");
        }
        //Intentando eliminar periodos con el metodo de eliminarPeriodos
        System.out.println("Eliminando 'Invierno 2026' (rendimiento cero)...");
        naranja.eliminarPeriodo("Invierno 2026");

        System.out.println("Intentando eliminar 'Verano 2026' (no existe)...");
        naranja.eliminarPeriodo("Verano 2026");

        //Comprobamos el estado final del objeto
        System.out.println(naranja.toString());

        System.out.println("Lista de periodos restantes:");
        for (PeriodosCosecha periodo : naranja.obtenerPeriodos()) {
            System.out.println(periodo.toString());
        }
    }
}
