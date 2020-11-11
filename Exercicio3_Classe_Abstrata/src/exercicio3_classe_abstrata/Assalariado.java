package exercicio3_classe_abstrata;

public class Assalariado extends Empregado{
    private double salario;
    
    public Assalariado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public double vencimento() {
        return this.getSalario();
    }

    public double getSalario() {
        return salario;
    }
    
    
}
