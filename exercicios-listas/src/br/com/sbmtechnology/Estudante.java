package br.com.sbmtechnology;

public class Estudante {

	private String nome;
	private double nota;

	public Estudante(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}
	
	@Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
