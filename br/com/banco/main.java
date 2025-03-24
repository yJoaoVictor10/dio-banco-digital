package br.com.banco;

public class main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João");

        Conta contaCorrente = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        contaCorrente.depositar(500);
        contaCorrente.transferir(80, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
            
        
    }
}
