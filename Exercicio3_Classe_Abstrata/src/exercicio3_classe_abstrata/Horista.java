package exercicio3_classe_abstrata;

public class Horista extends Empregado{
    
    private double precoHora;
    private double horasTrabalhadas;

    public double getPrecoHora() {
        return precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Horista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public double vencimento() {
        return (this.getHorasTrabalhadas()*this.getPrecoHora());
    }
    
}
