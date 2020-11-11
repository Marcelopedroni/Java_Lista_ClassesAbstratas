package exercicio2_classe_abstrata;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

     @Override
    public double getBonificacao() {
        return 0.2;
    }
    
    @Override
    public double obterSalario() {
        return this.getSalario() + this.getSalario()*this.getBonificacao();
        
    }

    @Override
    public String obterCargo() {
        return "Gerente";
    }
    
    
}
