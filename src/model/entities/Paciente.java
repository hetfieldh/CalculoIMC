package model.entities;

public abstract class Paciente {

	private Character sexo;

	public Paciente(Character sexo) {
		this.sexo = sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Character getSexo() {
		return sexo;
	}

	public abstract String calculoIMC();

}