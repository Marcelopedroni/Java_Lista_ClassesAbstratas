package exercicio2_classe_abstrata;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private double bonificacao;
    
    
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario + (salario*bonificacao);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract double obterSalario();
    public abstract String obterCargo();
}
