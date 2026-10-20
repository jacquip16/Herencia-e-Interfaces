package com.pilli.proyecto2;

public class FiguraRecta extends Figura2D {

    protected int ancho;
    protected int alto;

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}