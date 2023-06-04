package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    //atributos
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    //metodos
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños);
        this.valorAdministracion =valorAdministracion;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +valorAdministracion);
        System.out.println();
    }
}