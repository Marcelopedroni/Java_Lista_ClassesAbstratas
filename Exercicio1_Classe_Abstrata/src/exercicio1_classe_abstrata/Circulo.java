package exercicio1_classe_abstrata;

public class Circulo extends Forma {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        area = (raio * raio * 3.14);
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = (2 * 3.14 * raio);
        return perimetro;
    }
}
