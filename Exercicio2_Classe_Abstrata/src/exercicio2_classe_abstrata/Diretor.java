package exercicio2_classe_abstrata;

public class Diretor extends Gerente{
    
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double obterSalario() {
        return this.getSalario() + this.getSalario()*this.getBonificacao();
    }

    @Override
    public String obterCargo() {
        return "Diretor";
    }
    
}
