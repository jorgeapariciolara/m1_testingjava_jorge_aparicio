package com.company.cliente.clases;

import com.company.cliente.objetos.Cliente;
import com.company.cliente.objetos.Factura;


import java.util.ArrayList;
import java.util.List;

public class MetodosCliente {

    // CONSTANTES
    private static final double IVA = 1.21;
    private static final double DTO10 = 0.90;
    private static final double DTO20 = 0.80;
    private static final double DTO50 = 0.50;

    List<Cliente> cliente = new ArrayList<>();
    Factura factura = new Factura();


    public double calcularFactura(Cliente cliente) {

        // Defino la fórmula de cálculo
        double sumaTotal = cliente.getFactura().getComida() +
                cliente.getFactura().getMedicamentos() +
                cliente.getFactura().getConsulta();


        // Defino algunos incrementos y descuentos a aplicar
        double[] resultado = new double[4];
        double totalIva = sumaTotal * IVA;
        double dto10 = (sumaTotal * DTO10) * IVA;
        double dto20 = (sumaTotal * DTO20) * IVA;
        double dto30 = (sumaTotal * DTO50) * IVA;
        resultado[0] = totalIva;
        resultado[1] = dto10;
        resultado[2] = dto20;
        resultado[3] = dto30;

        // Creo las condiciones para aplicar los dtos con un if else if
        if (sumaTotal < 100.00) {
            System.out.println("El importe de su factura asciende a " + resultado[0] + " €");
        } else if (sumaTotal > 100.00 && sumaTotal < 150.00) {
            System.out.println("El importe de su factura asciende a " + resultado[1] + " €");
        } else if (sumaTotal > 150.00 && sumaTotal < 200.00) {
            System.out.println("El importe de su factura asciende a " + resultado[2] + " €");
        } else if (sumaTotal > 200.00) {
            System.out.println("El importe de su factura asciende a " + resultado[3] + " €");
        }

        // Pido que me devuelva el resultado por consola
        return sumaTotal;


    }

}
