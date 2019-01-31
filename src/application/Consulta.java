package application;

import java.util.Scanner;

import model.entities.Feminino;
import model.entities.Masculino;
import model.entities.Paciente;
import model.exceptions.DomainException;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Consulta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Paciente> lista = new ArrayList<>();
		int n = 0;

		try {
			System.out.print("Quantidade de pacientes: ");
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERRO NO CADASTRO: Insira um valor inteiro...");
		}

		try {

			for (int i = 1; i <= n; i++) {
				System.out.println("PACIENTE #" + i + ":");
				System.out.print("Sexo(M/F): ");
				char sexo = sc.next().charAt(0);
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				System.out.print("Peso(kg): ");
				double peso = sc.nextDouble();
				System.out.print("Altura(mt): ");
				double altura = sc.nextDouble();

				if (sexo == 'f' || sexo == 'F') {
					lista.add(new Feminino(sexo, nome, idade, peso, altura));
				} else {
					lista.add(new Masculino(sexo, nome, idade, peso, altura));
				}
			}

		} catch (DomainException e) {
			System.out.println("ERRO DE CALCULO: " + e.getMessage());
		}

		System.out.println();
		System.out.println("===============================================");

		for (Paciente x : lista) {
			System.out.println(x);
		}

		sc.close();
	}
}