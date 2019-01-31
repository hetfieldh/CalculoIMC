package model.entities;

import model.exceptions.DomainException;

public class Masculino extends Paciente {

	private String nome;
	private Integer idade;
	private Double peso;
	private Double altura;

	private Double imc;

	public Masculino(Character sexo, String nome, Integer idade, Double peso, Double altura) {
		super(sexo);
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public Double calculoIMC() {
		if (peso < 20 || altura < 1) {
			throw new DomainException("Peso ou altura inválidos ou muito baixos. Favor verificar!");
		} else {
			return imc = peso / Math.pow(altura, 2);
		}
	}

	public String resultado() {
		if (imc < 20) {
			return "Abaixo do peso";
		} else if (imc >= 20 && imc < 25) {
			return "Peso normal";
		} else if (imc >= 25 && imc < 30) {
			return "Obesidade leve";
		} else if (imc >= 30 && imc < 40) {
			return "Obesidade moderada";
		} else {
			return "Obesidade Morbida";
		}
	}

	public String toString() {
		return "----------------------------------------------" 
				+ "\nRESULTADO DO EXAME DE I.M.C. - DADOS DO PACIENTE"
				+ "\nSexo: Masculino" 
				+ "\nNome: " + nome 
				+ "\nIdade: " + idade 
				+ "\nPeso: " + String.format("%.2f", peso) 
				+ "\nAltura: " + String.format("%.2f", altura) 
				+ "\n--> IMC: " + String.format("%.2f", calculoIMC())
				+ "\n--> Resultado: "+ resultado(); 
				
	}
}