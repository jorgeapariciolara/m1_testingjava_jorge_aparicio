package com.company.cliente.objetos;

public class Cliente {

    // 1. Atributos
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer edad;
    private Telefono telefono;
    private Boolean carnetSocio;
    private Factura factura;

    // 2.- Constructores
    public Cliente(String dni, String josé_luis, String flores, String romero, int edad, Telefono telefono1, boolean carnetSocio, Factura factura1) {}

    public Cliente(String dni,
                   String nombre,
                   String primerApellido,
                   String segundoApellido,
                   Integer edad,
                   Telefono telefono,
                   Boolean carnetSocio,
                   Factura factura) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.telefono = telefono;
        this.carnetSocio = carnetSocio;
        this.factura = factura;
    }

    // 3.- Métodos

    // Getter & Setter => permiten obtener datos encapsulados
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getPrimerApellido() {return primerApellido;}
    public void setPrimerApellido(String primerApellido) {this.primerApellido = primerApellido;}
    public String getSegundoApellido() {return segundoApellido;}
    public void setSegundoApellido(String segundoApellido) {this.segundoApellido = segundoApellido;}
    public Integer getEdad() {return edad;}
    public void setEdad(Integer edad) {this.edad = edad;}
    public Telefono getTelefono() {return telefono;}
    public void setTelefono(Telefono telefono) {this.telefono = telefono;}
    public Boolean getCarnetSocio() {return carnetSocio;}
    public void setCarnetSocio(Boolean carnetSocio) {this.carnetSocio = carnetSocio;}
    public Factura getFactura() {return factura;}
    public void setFactura(Factura factura) {this.factura = factura;}

    // toString() => permite "imprimir" todos los atributos de un dato
    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", carnetSocio=" + carnetSocio +
                ", factura=" + factura +
                '}';
    }
}
