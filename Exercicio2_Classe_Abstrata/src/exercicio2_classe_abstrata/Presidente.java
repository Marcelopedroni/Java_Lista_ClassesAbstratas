package exercicio2_classe_abstrata;

public class Presidente extends Funcionario {

    public Presidente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double obterSalario() {
        return this.getSalario() + this.getSalario()*this.getBonificacao();
    }

    @Override
    public String obterCargo() {
        return "Presidente";
    }

    @Override
    public double getBonificacao() {
        return 0.3;
    }
}
