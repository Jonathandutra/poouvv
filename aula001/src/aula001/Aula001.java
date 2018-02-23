/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alunodev03
 */
public class Aula001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner( System.in);
        String nome; 
        int idade; 
        System.out.println("Informe o seu nome: ");
        nome = tc.next();
        System.out.println("Informe a sua idade: ");
        idade = tc.nextInt();
        System.out.println("o valor e: "+ numero());
        
    }
    
    public static int numero ()
    {
        int valor;
        Random po = new Random();
        valor = po.nextInt(10);        
        return valor;
    }
    
    public static void dicas(int d)
    {
        if(d == 0)
        {
       System.out.println("Tente um numero");
        }else{
         switch(d)
        {
            case 1:case 2:case 3:case 4:case 5:case 6:case 7:
                System.out.println("Chute um valor menor de 1000");
                break;
             case 8:case 9:case 10:
                System.out.println("Chute um valor menor de 100");
                break;
             default:
                 System.out.println("tente um numero menor que 10");
                break;
           
        }
        }
    }
}
