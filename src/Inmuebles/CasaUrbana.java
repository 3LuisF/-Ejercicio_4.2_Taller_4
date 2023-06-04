package Inmuebles;

public class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños,int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños, numeroPisos);
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
