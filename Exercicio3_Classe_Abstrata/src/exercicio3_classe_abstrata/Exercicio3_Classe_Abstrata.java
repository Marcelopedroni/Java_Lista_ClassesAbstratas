package exercicio3_classe_abstrata;

public class Exercicio3_Classe_Abstrata {

    public static void main(String[] args) {
           
        Empregado e1 = new Assalariado("Marcelo", "Pedroni", "00000000");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Sobrenome: " + e1.getSobrenome());
        System.out.println("CPF: " + e1.getCpf());
        System.out.println("Total de vencimentos: " + e1.vencimento());
        System.out.println("=========");
                
        Comissionado e2 = new Comissionado("Creusa", "Silva", "0921731");
        e2.setTaxaComissao(0.3);
        e2.setTotalVenda(20000);
        System.out.println("Nome: " + e2.getNome());
        System.out.println("Sobrenome: " + e2.getSobrenome());
        System.out.println("CPF: " + e2.getCpf());
        System.out.println("Total de Vendas: " + e2.getTotalVenda());
        System.out.println("Taxa de Comissão: " + e2.getTaxaComissao() +"%");
        System.out.println("Total de vencimentos: " + e2.vencimento());
        System.out.println("=========");
        
        Horista e3 = new Horista("Odirlei", "Botânico", "3287833-44");
        e3.setHorasTrabalhadas(225);
        e3.setPrecoHora(25);
        System.out.println("Nome: " + e3.getNome());
        System.out.println("Sobrenome: " + e3.getSobrenome());
        System.out.println("CPF: " + e3.getCpf());
        System.out.println("Total de Horas Trabalhadas: " + e3.getHorasTrabalhadas());
        System.out.println("Preço da Hora R$: " + e3.getPrecoHora());
        System.out.println("Total de vencimentos: " + e3.vencimento());
        System.out.println("=========");
        
    }

}
