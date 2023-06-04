package Inmuebles;

public class Casa extends InmuebleVivienda{
    //atributos
    protected int numeroPisos;
    public Casa(int identificadorInmobiliario, int area,String direccion,int numeroHabitaciones,int numerBaños,int numeroPisos){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numerBaños);
        this.numeroPisos=numeroPisos;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + numeroPisos);
    }

}
