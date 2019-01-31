package model.entities;

public class Feminino extends Paciente {

	private String nome;
	private Integer idade;
	private Double peso;
	private Double altura;
	private Double imc;

	public Feminino(Character sexo, String nome, Integer idade, Double peso, Double altura) {
		super(sexo);
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}

	@Override
	public String calculoIMC() {
		imc = peso / Math.pow(altura, 2);

		if (imc < 19) {
			return "Abaixo do peso";
		} else if (imc >= 19 && imc < 24) {
			return "Peso normal";
		} else if (imc >= 24 && imc < 29) {
			return "Obesidade leve";
		} else if (imc >= 29 && imc < 39) {
			return "Obesidade moderada";
		} else {
			return "Obesidade Morbida";
		}
	}

	public String toString() {
		return "\n-----------------------------------------------"
				+ "\nRESULTADO DO EXAME DE I.M.C. - DADOS DO PACIENTE" + "\nSexo: Feminino" + "\nNome: " + nome
				+ "\nIdade: " + idade + "\nPeso: " + String.format("%.2f", peso) + "\nAltura: "
				+ String.format("%.2f", altura) + "\n--> Resultado: " + calculoIMC() + "\n--> IMC: "
				+ String.format("%.2f", imc);
	}
}