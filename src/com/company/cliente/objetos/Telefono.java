package com.company.cliente.objetos;

public class Telefono {

    // 1. Atributos
    private String domicilio1;
    private String domicilio2;
    private String domicilio3;
    private String movil1;
    private String movil2;
    private String movil3;
    private String trabajo1;
    private String trabajo2;
    private String trabajo3;

    // 2. Constructores
    public Telefono () {}
    public Telefono(String domicilio1, String domicilio2, String domicilio3,
                    String movil1, String movil2, String movil3,
                    String trabajo1, String trabajo2, String trabajo3) {
        this.domicilio1 = domicilio1;
        this.domicilio2 = domicilio2;
        this.domicilio3 = domicilio3;
        this.movil1 = movil1;
        this.movil2 = movil2;
        this.movil3 = movil3;
        this.trabajo1 = trabajo1;
        this.trabajo2 = trabajo2;
        this.trabajo3 = trabajo3;
    }

    // 3. Métodos
    public String getDomicilio1() {
        return domicilio1;
    }
    public void setDomicilio1(String domicilio1) {
        this.domicilio1 = domicilio1;
    }
    public String getDomicilio2() {
        return domicilio2;
    }
    public void setDomicilio2(String domicilio2) {
        this.domicilio2 = domicilio2;
    }
    public String getDomicilio3() {
        return domicilio3;
    }
    public void setDomicilio3(String domicilio3) {
        this.domicilio3 = domicilio3;
    }
    public String getMovil1() {
        return movil1;
    }
    public void setMovil1(String movil1) {
        this.movil1 = movil1;
    }
    public String getMovil2() {
        return movil2;
    }
    public void setMovil2(String movil2) {
        this.movil2 = movil2;
    }
    public String getMovil3() {
        return movil3;
    }
    public void setMovil3(String movil3) {
        this.movil3 = movil3;
    }
    public String getTrabajo1() {
        return trabajo1;
    }
    public void setTrabajo1(String trabajo1) {
        this.trabajo1 = trabajo1;
    }
    public String getTrabajo2() {
        return trabajo2;
    }
    public void setTrabajo2(String trabajo2) {
        this.trabajo2 = trabajo2;
    }
    public String getTrabajo3() {
        return trabajo3;
    }
    public void setTrabajo3(String trabajo3) {
        this.trabajo3 = trabajo3;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "domicilio1='" + domicilio1 + '\'' +
                ", domicilio2='" + domicilio2 + '\'' +
                ", domicilio3='" + domicilio3 + '\'' +
                ", movil1='" + movil1 + '\'' +
                ", movil2='" + movil2 + '\'' +
                ", movil3='" + movil3 + '\'' +
                ", trabajo1='" + trabajo1 + '\'' +
                ", trabajo2='" + trabajo2 + '\'' +
                ", trabajo3='" + trabajo3 + '\'' +
                '}';
    }
}
