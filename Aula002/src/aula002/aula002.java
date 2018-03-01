package aula002;

import testePacote.Carro;
import exercicios.Bicicleta;
public class aula002 {

    public static void main(String[] args) {

        Carro veiculo = new Carro();


            veiculo.set("vermelho", "vectra", "2.0");
            veiculo.ligar();
            veiculo.acelerar((float) 1.5);
            veiculo.frear();
            veiculo.desligar();
            Bicicleta b = new Bicicleta();
            
            b.aumenta((float)8.5);
            System.out.println("a velocidade e de :" + b.get());
            b.diminuir(-2);
            System.out.println("a velocidade e de :" + b.get());

    }

}
