package br.com.rd.rdevs.model;

public abstract class Conta implements Comparable<Conta> {
	private String tipoConta;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	private int identificador;
	private static int qtdContas;
	
	
	public abstract String getTipoConta();
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero () {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public static int getQtdContas() {
		return qtdContas;
	}
	
	public static void setQtdContas(int qntdContas) {
		Conta.qtdContas = qntdContas;
	}
	
	public Conta() {
		this.qtdContas += 1;
		this.identificador = qtdContas;
		this.tipoConta = "Corrente";
	}
	
	public boolean sacar(double valorSacado){
		if(this.saldo < valorSacado && valorSacado < 0){
			return false;
		}else{	
			if(getTipoConta() == "Conta Corrente") {
				this.saldo -= 0.10;
			}
			this.saldo = this.saldo - valorSacado;
			return true;
		}
	}
	
	public boolean depositar(double valorDepositado){
		if (valorDepositado < 0){
			return false;
		}else{
			this.saldo += valorDepositado;
			return true;
		}	
	}
	
	boolean transferir(Conta destino, double valorTransferido){
		boolean retirou = this.sacar(valorTransferido);
		if (!retirou){
			return false;
		}else{
			destino.depositar(valorTransferido);
			this.saldo -= valorTransferido;
			destino.saldo = destino.saldo + valorTransferido;
			return true;
		}
	}
	
	public double calcularRendimento(){
		this.saldo = this.saldo + (this.saldo * 0.1);
		double rendimento = this.saldo;
		return rendimento;
	}
	
	public String recuperarDados() {
		return "Tipo Conta: " + getTipoConta() + "\n" +
				"Titular: " + this.titular + "\n" +
				"Numero: " + this.numero + "\n" +
				"Agencia: " + this.agencia + "\n" +
				"Saldo: " + this.saldo + "\n" +
				"Data de Abertura: " + this.dataAbertura;
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
