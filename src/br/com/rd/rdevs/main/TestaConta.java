package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import br.com.rd.rdevs.model.ContaCorrente;
import br.com.rd.rdevs.model.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {

		ContaPoupanca conta1 = new ContaPoupanca();
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();
		
		conta2.setTitular("Gutemberg");
		conta2.setNumero(2727);
		conta2.setAgencia("Bradesco - 3111");
		conta2.setSaldo(5000);
		conta2.setDataAbertura("17/07/2020");
		
		conta3.setTitular("Ivo");
		conta3.setNumero(3232);
		conta3.setAgencia("Bradesco - 3111");
		conta3.setSaldo(10000);
		conta3.setDataAbertura("17/07/2020");
		
		List<ContaCorrente> listaCorrente = new ArrayList<>();
		listaCorrente.add(conta2);
		listaCorrente.add(conta3);
		
		System.out.println(listaCorrente);
		Collections.sort(listaCorrente);
		System.out.println(listaCorrente);
		//conta1.setTitular("Gutemberg");
		//conta1.setNumero(2727);
		//conta1.setAgencia("Bradesco - 3111");
		//conta1.setSaldo(5000);
		//conta1.setDataAbertura("17/07/2020");
		
		//conta1.depositar(3500);
		//conta1.sacar(500);
		//System.out.println("Rendimento: R$" + conta1.calcularRendimento());
		//System.out.println(conta1.recuperarDados());
		
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(10000);
		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(3000);
		// cria o mapa
		Map mapaDeContas = new HashMap();
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		// qual a conta do diretor?
		ContaCorrente contaDoDiretor = (ContaCorrente) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
