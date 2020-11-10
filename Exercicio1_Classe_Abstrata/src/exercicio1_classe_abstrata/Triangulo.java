package exercicio1_classe_abstrata;

import static java.lang.Math.sqrt;

public class Triangulo extends Forma{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        this.perimetro = 3*lado;
        return this.perimetro;
    }

    @Override
    public double getArea() {
        this.area = ((lado*lado)*sqrt(3))/4;
        return this.area;
    }
}
