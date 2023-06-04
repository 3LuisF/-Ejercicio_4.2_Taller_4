package Inmuebles;

public class CasaRural extends Casa {
    //atributos
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;

    //constructores
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños,int numeroPisos,int distanciaCabera,int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " + numeroHabitaciones + "km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + "metros.");
        System.out.println();
    }

}