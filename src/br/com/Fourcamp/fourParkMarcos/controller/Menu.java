package br.com.Fourcamp.fourParkMarcos.controller;

import java.util.HashMap;
import java.util.Scanner;
import br.com.Fourcamp.fourParkMarcos.model.Vagas;
import br.com.Fourcamp.fourParkMarcos.service.ServicoBuscar;
import br.com.Fourcamp.fourParkMarcos.service.ServicoEstacionar;
import br.com.Fourcamp.fourParkMarcos.service.ServicoRetirar;
import br.com.Fourcamp.fourParkMarcos.service.ServicoVerificarVagas;
import br.com.Fourcamp.fourParkMarcos.service.Utilitarios;

public class Menu {
		static boolean repetir;
		public static void opcaoMenu(Scanner input, HashMap<Integer, Vagas> estacionamento) {
			while (repetir!= true) {
			System.out.println(Utilitarios.traco());
			System.out.println(Utilitarios.traco());
			System.out.println("      1 - ESTACIONAR\n");
			System.out.println("      2 - BUSCAR\n");
			System.out.println("      3 - VERIFICAR VAGAS\n");
			System.out.println("      4 - RETIRAR\n");
			System.out.println("      5 - SAIR DO SISTEMA\n");
			System.out.println(Utilitarios.traco());
			System.out.print("Digite a opção que deseja operar: ");
			int opcao = input.nextInt();
			escolhaMenu(opcao, estacionamento, input);
			if (opcao == 5) {break;}
			
			}
		}
		public static void escolhaMenu(int escolha, HashMap<Integer, Vagas> estacionamento, Scanner input) {
	
			switch (escolha) {
			case 1: {
				ServicoEstacionar.estacionar(estacionamento, input);
				break;
			}
			case 2: {
				ServicoBuscar.buscar(estacionamento, input);
				break;
			}
			case 3: {
				ServicoVerificarVagas.verificar(estacionamento, input);
				break;
			}
			case 4: {
				ServicoRetirar.retirar(estacionamento, input);
				break;
			}
			case 5: {
				System.out.println("Sistema encerrado!");
				break;
	
			}
			default:
				System.out.println("Insira valores válidos!");
			}
		}
}

