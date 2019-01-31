package application;

import java.util.Scanner;

import model.entities.Feminino;
import model.entities.Masculino;
import model.entities.Paciente;

import java.util.List;
import java.util.ArrayList;

public class Consulta {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Paciente> lista = new ArrayList<>();

		System.out.print("Numero de pacientes: ");
		int n = sc.nextInt();

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

		System.out.println();
		System.out.println("===============================================");

		for (Paciente x : lista) {
			System.out.println(x);
		}

		sc.close();
	}
}