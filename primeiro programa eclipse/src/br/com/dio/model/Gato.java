package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String nomeString;
	private String cor;
	private Integer idade;

	public Gato() {
	}

	public Gato(String nomeString, String cor, Integer idade) {
		this.nomeString = nomeString;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nomeString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade)
				&& Objects.equals(nomeString, other.nomeString);
	}

	@Override
	public String toString() {
		return "Gato [nomeString=" + nomeString + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nomeString = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
