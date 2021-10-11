package com.company.cliente.objetos;

public class Factura {

    // 1. Atributos
    private Double comida;
    private Double consulta;
    private Double medicamentos;

    // 2. Constructores
    public Factura() {}
    public Factura(Double comida,
                   Double consulta,
                   Double medicamentos) {
        this.comida = comida;
        this.consulta = consulta;
        this.medicamentos = medicamentos;
    }

    // 3. Métodos
    public Double getComida() {
        return comida;
    }
    public void setComida(Double comida) {
        this.comida = comida;
    }
    public Double getConsulta() {
        return consulta;
    }
    public void setConsulta(Double consulta) {
        this.consulta = consulta;
    }
    public Double getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(Double medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "comida=" + comida +
                ", consulta=" + consulta +
                ", medicamentos=" + medicamentos +
                '}';
    }
}
