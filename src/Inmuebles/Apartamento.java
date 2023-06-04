package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area,String direccion,int numeroHabitaciones,int numerBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños);
    }void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }

}
