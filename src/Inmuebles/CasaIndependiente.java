package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños, numeroPisos);

    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
