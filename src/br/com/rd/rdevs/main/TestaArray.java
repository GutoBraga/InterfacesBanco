package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Conta;
import br.com.rd.rdevs.model.ContaCorrente;

public class TestaArray {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		int somaSaldo = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
			contas[i] = conta;
		}
		
		for (int i = 0; i < contas.length; i++) {
			somaSaldo += contas[i].getSaldo();
		}
		
		System.out.println("media de saldo entre contas criadas é: " + (somaSaldo / contas.length));

	}

}
