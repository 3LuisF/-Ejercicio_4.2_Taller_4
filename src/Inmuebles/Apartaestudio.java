package Inmuebles;

public class Apartaestudio extends Apartamento {
    //atributos
    protected static double valorArea = 1500000;

    //constructores
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños);

    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
