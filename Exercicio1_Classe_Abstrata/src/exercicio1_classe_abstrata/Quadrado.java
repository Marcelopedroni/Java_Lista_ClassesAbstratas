package exercicio1_classe_abstrata;

public class Quadrado extends Forma {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        this.perimetro = 4*this.lado; 
        return this.perimetro;
    }

    @Override
    public double getArea() {
        this.area = this.lado*this.lado;
        return this.area;
    }

    
    
    
    
    
}
