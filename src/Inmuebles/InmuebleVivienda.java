package Inmuebles;
class InmuebleVivienda extends Inmueble {
    //atributos clase hija
    protected int numeroHabitaciones;
    protected int numeroBaños;
    //constructores
    public InmuebleVivienda(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,int numeroBaños){
        super(identificadorInmobiliario,area,direccion);
        this.numeroBaños=numeroBaños;
        this.numeroHabitaciones = numeroHabitaciones;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Numero de habitaciones = " +numeroHabitaciones);
        System.out.println("Número de baños = "+ numeroBaños);
    }

}
