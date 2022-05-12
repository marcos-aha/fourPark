package br.com.Fourcamp.fourParkMarcos.service;

import java.util.HashMap;
import java.util.Scanner;

import br.com.Fourcamp.fourParkMarcos.model.Vagas;

public class ServicoBuscar {

	public static void buscar(HashMap<Integer, Vagas> estacionamento, Scanner input) {
		String retorno = "";
		int opcao;
		System.out.println("  OPÇÕES DE BUSCA: ");
		System.out.println("  1 - POR PLACA    ");
		System.out.println("  2 - POR DOCUMENTO    ");
		
		while (true) {
			opcao = input.nextInt();
			if (opcao == 1) {
				System.out.print("Digite a placa: ");
				String placa = input.next().toUpperCase();
				for (int x = 1; x < 51; x++) {
					if (estacionamento.get(x).isOcupado() == true) {
						if (estacionamento.get(x).getVeiculo().getPlaca().equals(placa)) {
							retorno = String.format("Veiculo de placa: %s,foi estacionado na vaga: %s  às  %s hrs.",
									estacionamento.get(x).getVeiculo().getPlaca(), estacionamento.get(x).getPosicao(),
									estacionamento.get(x).getHoraEntrada());
							break;
						}
					}
				}
				if (retorno.equals("")) {
					retorno = "Veiculo não encontrado!";
				}
				System.out.println(retorno);
				break;
			} else if (opcao == 2) {
				System.out.print("Digite o documento do proprietário: ");
				String documento = input.next().toUpperCase();
				for (int x = 1; x < 51; x++) {
					if (estacionamento.get(x).isOcupado() == true) {
						if (estacionamento.get(x).getVeiculo().getDocumento().equals(documento)) {
							retorno = String.format("Veiculo de placa: %s,foi estacionado na vaga: %s  às  %s hrs.",
									estacionamento.get(x).getVeiculo().getPlaca(), estacionamento.get(x).getPosicao(),
									estacionamento.get(x).getHoraEntrada());
							break;
						}
					}
				}
				if (retorno.equals("")) {
					retorno = "Veiculo não encontrado!";
				}
				System.out.println(retorno);
				break;
			} else {
				System.err.println("Digite uma opção válida!");
			}
		}
	}
}
