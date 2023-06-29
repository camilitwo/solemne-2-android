package com.example.myapplication.dto;

public class IvaDto {
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public String calcularIva() {
        double resultado =0.0d;
        resultado = monto * 0.19;
        return String.format("%.2f", resultado);
    }
}
