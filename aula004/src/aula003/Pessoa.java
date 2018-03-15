package aula003;

import java.util.Calendar;

public class Pessoa {
  private String nome;
  private int anoNasc;
  private double altura;
  
  Pessoa (String nome, int anoNasc, double altura)
  {
      this.nome = nome;
      this.anoNasc = anoNasc;
      this.altura = altura;
  }
  public void Crescer (double m)
  {
      this.altura = this.altura + m;
  }
  private  int ObterAno()
  {
      Calendar ano = Calendar.getInstance();
      return ano.get(Calendar.YEAR);      
   }
  public int CalcularIdade(){
      return ObterAno() - this.anoNasc;
  }
  public void setNome(String nome)
  {
      this.nome= nome;
  }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  public String getNome()
  {
      return this.nome;
  }
}
