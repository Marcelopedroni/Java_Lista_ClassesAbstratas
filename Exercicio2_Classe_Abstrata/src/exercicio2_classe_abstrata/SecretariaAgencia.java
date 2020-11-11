package exercicio2_classe_abstrata;

public class SecretariaAgencia extends Secretaria{
    
    public SecretariaAgencia(String nome, double salario) {
        super(nome, salario);
    }
    
    
    @Override
    public double getBonificacao() {
        return 0.05;
    }
    
    @Override
    public double obterSalario() {
        return this.getSalario() + this.getSalario()*this.getBonificacao();
    }

    @Override
    public String obterCargo() {
        return "Secretária de Agência";
    }
}
