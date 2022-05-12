package br.com.Fourcamp.fourParkMarcos;

import java.util.HashMap;
import java.util.Scanner;

import br.com.Fourcamp.fourParkMarcos.controller.Menu;
import br.com.Fourcamp.fourParkMarcos.model.Vagas;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Vagas> estacionamento = new HashMap<>();
		
		for(int x = 1; x<=50; x++) {
			Vagas vaga = new Vagas(x);
			estacionamento.put(x, vaga);
		}
		System.out.println("\n  Seja Bem Vindo ao FourPark!");
		Menu.opcaoMenu(input, estacionamento);
		input.close();
	}
}
