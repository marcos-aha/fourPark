package br.com.Fourcamp.fourParkMarcos.service;

import java.util.HashMap;
import java.util.Scanner;

import br.com.Fourcamp.fourParkMarcos.model.Vagas;

public class ServicoRetirar {
	public static void retirar(HashMap<Integer, Vagas> estacionamento, Scanner input) {
		String hrSaida;
		System.out.print("Digite a placa do veículo: ");
		String placa = input.next().toUpperCase();
		System.out.print("Digite o documento do proprietário: ");
		String documento = input.next().toUpperCase();

		for (int x = 1; x < 51; x++) {
			if (estacionamento.get(x).isOcupado() == true) {
				if (estacionamento.get(x).getVeiculo().getPlaca().equals(placa)
						&& estacionamento.get(x).getVeiculo().getDocumento().equals(documento)) {
					System.out.println("Digite a hora de saída: ");
					hrSaida = input.next();
					estacionamento.get(x).setHoraSaida(hrSaida);
					System.out.println(estacionamento.get(x));
					estacionamento.put(x, new Vagas(x));
//					estacionamento.get(x).setVeiculo(null);
//					estacionamento.get(x).setOcupado(false);
//					estacionamento.get(x).setHoraEntrada(null);
//					estacionamento.get(x).setHoraSaida(null);
					System.out.println(estacionamento.get(x));
					break;
				}
			}
		}
		

	}
}
