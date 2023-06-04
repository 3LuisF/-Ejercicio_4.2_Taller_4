package Inmuebles;

public class Oficina extends Local{
    //Atributos
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    //constructores
    public Oficina(int identificadorInmobiliario, int area, String
            direccion, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }
}


