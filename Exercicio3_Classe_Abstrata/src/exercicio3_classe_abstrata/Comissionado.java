package exercicio3_classe_abstrata;

public class Comissionado extends Empregado{
    
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    
    
   
    @Override
    public double vencimento() {
        return (this.getTotalVenda()*this.getTaxaComissao());
    }
    
}
