package Inmuebles;

public class Local extends  Inmueble{
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;
    public Local(int identificadorInmobiliario, int area, String direccion,
                 tipo tipoLocal) {
// Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = ]" + tipoLocal);
    }
}
