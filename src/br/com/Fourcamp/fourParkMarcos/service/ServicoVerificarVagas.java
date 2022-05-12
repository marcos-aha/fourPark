package br.com.Fourcamp.fourParkMarcos.service;

import java.util.HashMap;
import java.util.Scanner;

import br.com.Fourcamp.fourParkMarcos.model.Vagas;

public class ServicoVerificarVagas {

	public static void verificar(HashMap<Integer, Vagas> estacionamento, Scanner input) {
		String retorno = "";

		for (int x = 1; x < 51; x++) {
			if (estacionamento.get(x).isOcupado() == true) {
				retorno += String.format("Vaga: %d ocupada, placa do veiculo: %s\n", x,
						estacionamento.get(x).getVeiculo().getPlaca());
			} 
			else if (estacionamento.get(x).isOcupado() == false) {
				retorno += String.format("Vaga: %d disponivel\n", x);
			}

		}
		System.out.println(retorno);
	}
}
