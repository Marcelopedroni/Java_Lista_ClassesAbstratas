/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_classe_abstrata;

import java.util.Scanner;

/**
 *
 * @author LocalHost
 */
public class Exercicio1_Classe_Abstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("Digite o lado do Quadrado: ");
       // Scanner sc2 = new Scanner(System.in);
        //System.out.println("Digite os lados do retângulo: ");
        //Scanner sc3 = new Scanner(System.in);
        //System.out.println("Digite o lado do triângulo: ");
        //Scanner sc4 = new Scanner(System.in);    
        
       
        
        
        
        Triangulo t = new Triangulo();
        System.out.println("---------------");
        System.out.println("Triângulo");
        t.setLado(2);
        System.out.println("Lado: " + t.getLado());
        System.out.println("Área: " + t.getArea());
        System.out.println("Perímetro: " + t.getPerimetro());
       
        
        Retangulo r = new Retangulo();
        System.out.println("---------------");
        System.out.println("Retângulo");
        r.setLado(2);
        r.setBase(4);
        System.out.println("Lado: " + r.getLado());
        System.out.println("Base: " + r.getBase());
        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());
       
        
        
        
        
        Quadrado q = new Quadrado();
        System.out.println("---------------");
        System.out.println("Quadrado");
        q.setLado(2);
        System.out.println("Lado: " + q.getLado());
        System.out.println("Área: " + q.getArea());
        System.out.println("Perímetro: " + q.getPerimetro());
       
        
        
        Circulo c = new Circulo();
        System.out.println("---------------");
        System.out.println("Círculo");
        c.setRaio(1);
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.getArea());
        System.out.println("Perímetro: " + c.getPerimetro());
        System.out.println("---------------");
        System.out.println("FIM DO PROGRAMA");
        
        
    }
    
}
