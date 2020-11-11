package exercicio2_classe_abstrata;

public abstract class Secretaria extends Funcionario {

    public Secretaria(String nome, double salario) {
        super(nome, salario);
    }

      
    @Override
    public double obterSalario() {
        return this.getSalario();
    }

    @Override
    public String obterCargo() {
        return "Secretária";
    }

        
}
