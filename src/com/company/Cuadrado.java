package com.company;

public class Cuadrado extends FiguraGeometrica{

    private double lado;

public Cuadrado(String nombreFigura, double lado){
    super(nombreFigura);
    this.lado = lado;
}

@Override
public double getArea() {
    return this.lado * this.lado;
}


@Override
public double getPerimetro() {
    return 4 * this.lado;
}

@Override
public String toString() {
    return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
}

}