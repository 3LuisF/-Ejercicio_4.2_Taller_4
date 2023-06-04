package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    //atributos
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    //metodos
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numerBaños, int numeroPisos, int valorAdministracion,boolean tienePiscina,boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numerBaños, numeroPisos);
        this.valorAdministracion =valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " +tieneCamposDeportivos);
        System.out.println();
    }
}