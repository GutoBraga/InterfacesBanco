package br.com.rd.rdevs.model;

public class SeguroDeVida implements Tributavel{
	private int numeroApolice;
	private String titular;
	private double valor;
	
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public SeguroDeVida(int numeroApolice, String titular, double valor) {
		this.numeroApolice = numeroApolice;
		this.titular = titular;
		this.valor = valor;
	}
	
	public void recuperaDados() {
		System.out.println("Numero de Apolice: " + this.numeroApolice);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Valor do seguro: " + this.valor);
	}
	@Override
	public double getValorImposto() {
		return 42 + (this.valor * 0.02);
	}
}
