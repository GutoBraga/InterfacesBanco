package br.com.rd.rdevs.model;

public class Presidente extends Funcionario {
	private int idPresidente;
	private int numeroDeFuncionariosGerenciados;
	private int senha;
	private double salario;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.15;
	}
}
