
package aula004;
import aula003.Pessoa;
public class Aula004 {

    public static void main(String[] args) {
    
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        
        cliente.setNome(InOut.leString("Informe o nome do cliente: "));
        cliente.setCpf(InOut.leString( cliente.getNome()+ "\n Informe o Cpf: "));
        cliente.setEndereco(InOut.leString("informe o endereco: "));
        
       conta.setCliente(cliente);
       conta.setLimite(InOut.leDouble("Informe o valor do limite: "));
       conta.setNumero(InOut.leInt("Informe o numero da conta: "));
       conta.setSaldo(InOut.leDouble("informe o saldo "));
       
       InOut.MsgDeInformacao("CLIENTE: \t" + cliente.getNome() , 
               "NOME: " + cliente.getNome() + "\n" +
               "CPF: " + cliente.getCpf() + "\n" +
              "ENDEREÇO: " +cliente.getEndereco() +"\n" +
              "NUMERO DA CONTA: " +conta.getNumero()+ "\n" +
              "SALDO: " + conta.getSaldo() +"\n" +
              "LIMITE: " +conta.getLimite()+ "\n"
               );
        
    }
    
}
