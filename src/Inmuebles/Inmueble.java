package Inmuebles;
public class Inmueble {
    //atributos2
    protected int identificadorInmobiliario,area;
    protected String direccion;
    protected double precioVenta;
    //metodo para construir clase inmueble
    Inmueble(int identificadorInmobiliario,int area,String direccion){
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area= area;
        this.direccion = direccion;
    }
    //metodo para calcular su precio de venta
    double calcularPrecioVenta(double valorArea){
        precioVenta = area*valorArea;
        return precioVenta;
    }
    void imprimir(){
        System.out.println("Identificador inmobiliario = "+identificadorInmobiliario);
        System.out.println("Area: "+ area+"mm2");
        System.out.println("Dirección = "+ direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }

}