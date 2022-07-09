package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double precioUnidad,cantidadProductos, iva, precioSinIva, totalIva;

        System.out.print("Introduzca el precio por Unidad del producto: ");
        precioUnidad=sc.nextDouble();

        System.out.print("Introduzca el numero de productos vendidos: ");
        cantidadProductos =sc.nextDouble();

        System.out.print("Introduzca Porcentaje de IVA: ");
        iva= sc.nextDouble();

        precioSinIva=  precioUnidad * cantidadProductos;
        totalIva=precioSinIva *iva/100;

        System.out.println("Precio de venta= "+(precioSinIva + totalIva) );


    }
}
