package exercicio2_classe_abstrata;

public class SecretariaAdministrativa extends Secretaria{
    
    public SecretariaAdministrativa(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double getBonificacao() {
        return 0.1;
    }
    
    @Override
    public double obterSalario() {
        return this.getSalario() + this.getSalario()*this.getBonificacao();
    }

    @Override
    public String obterCargo() {
        return "Secretária Administrativa";
    }
    
}
