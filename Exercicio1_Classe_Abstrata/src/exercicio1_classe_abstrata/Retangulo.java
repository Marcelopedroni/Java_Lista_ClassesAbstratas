package exercicio1_classe_abstrata;

public class Retangulo extends Forma{
    
    private double base;
    private double lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double getArea(){
        this.area = this.lado*this.base;
        return this.area;
    }
    
    @Override
    public double getPerimetro(){
        this.perimetro = (this.lado*2) + (2*this.base);
        return this.perimetro;
    }
}
