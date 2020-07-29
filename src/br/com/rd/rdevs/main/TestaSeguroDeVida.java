package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.SeguroDeVida;

public class TestaSeguroDeVida {

	public static void main(String[] args) {
		SeguroDeVida seguro = new SeguroDeVida(11, "Gutemberg", 2000);
		
		seguro.getValorImposto();
		
		seguro.recuperaDados();
		System.out.println("Valor do imposto do seguro: " + seguro.getValorImposto());

	}

}
