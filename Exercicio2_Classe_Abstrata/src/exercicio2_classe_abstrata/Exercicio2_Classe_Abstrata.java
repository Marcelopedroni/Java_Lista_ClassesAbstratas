package exercicio2_classe_abstrata;

public class Exercicio2_Classe_Abstrata {

    public static void main(String[] args) {
        
        Funcionario a2 = new Presidente("João", 10000);
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Cargo: " + a2.obterCargo());
        System.out.println("Salário com Bonificação: " + a2.obterSalario());
        System.out.println("==========");
        
        Funcionario a3 = new Gerente("Marcela", 5000);
        System.out.println("Nome: " + a3.getNome());
        System.out.println("Cargo: " + a3.obterCargo());
        System.out.println("Salário com Bonificação: " + a3.obterSalario());
        System.out.println("==========");
        
        Funcionario a4 = new SecretariaAgencia ("Manoela", 1800);
        System.out.println("Nome: " + a4.getNome());
        System.out.println("Cargo: " + a4.obterCargo());
        System.out.println("Salário com Bonificação: " + a4.obterSalario());
        System.out.println("==========");
        
        Funcionario a5 = new SecretariaAdministrativa ("Rafael", 2100);
        System.out.println("Nome: " + a5.getNome());
        System.out.println("Cargo: " + a5.obterCargo());
        System.out.println("Salário com Bonificação: " + a5.obterSalario());
        System.out.println("==========");
        
        Funcionario a6 = new Diretor ("Lucas", 4000);
        System.out.println("Nome: " + a6.getNome());
        System.out.println("Cargo: " + a6.obterCargo());
        System.out.println("Salário com Bonificação: " + a6.obterSalario());
        System.out.println("==========");
    }
    }
    

