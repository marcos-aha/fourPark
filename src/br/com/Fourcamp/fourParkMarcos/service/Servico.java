package br.com.Fourcamp.fourParkMarcos.service;

import java.util.HashMap;

import java.util.Scanner;

import br.com.Fourcamp.fourParkMarcos.model.Vagas;
import br.com.Fourcamp.fourParkMarcos.model.Veiculo;

public class Servico {

	public static void estacionar(HashMap<Integer, Vagas> estacionamento, Scanner input) {
		Veiculo veiculo = new Veiculo();
		Integer posicao;
		System.out.print("Digite a placa do veículo: ");
		veiculo.setPlaca(input.next().toUpperCase());
		System.out.print("Digite o modelo do veículo: ");
		veiculo.setModelo(input.next().toUpperCase());
		System.out.print("Digite o nome do proprietário do veículo: ");
		veiculo.setProprietario(input.next().toUpperCase());
		System.out.print("Digite o documento do proprietário: ");
		veiculo.setDocumento(input.next());
		while (true) {	
			while (true) {
				try {
					System.out.println("Selecione uma vaga válida: ");
					posicao = input.nextInt();
					break;
				} catch (NullPointerException c) {
					System.out.println("Selecione uma vaga válida: ");
					posicao = input.nextInt();
					if (posicao > 0 && posicao < 51) {break;}
				}
			}
			if (!estacionamento.get(posicao).isOcupado()) {
				System.out.println("hora entrada: ");
				String entrada = input.next();
				Vagas vaga = new Vagas(posicao.toString(), entrada, veiculo);
				estacionamento.put(posicao, vaga);
				System.out.println("Veiculo de placa: " + veiculo.getPlaca() + ",foi estacionado na vaga: " 
				+ vaga.getPosicao() + " às " + vaga.getHoraEntrada() + "hrs.");
				
				break;
			} else if (estacionamento.get(posicao).isOcupado()) {
				System.err.println("Vaga ocupada, escolha outra opção!");
			}
		}
	
	}
}
