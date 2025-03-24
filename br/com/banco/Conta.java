package br.com.banco;

public abstract class Conta implements InterfaceConta{
    private static final int agenciaPadrao = 1;
    private static int sequencial = 1;

    protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

    public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao;
		this.numero = sequencial++;
		this.cliente = cliente;
	}

    @Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	protected void imprimirInfo() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
