package br.com.sbmtechnology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstudanteTeste {
	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<>();

		estudantes.add(new Estudante("Ana", 9.5));
		estudantes.add(new Estudante("Bruno", 8.0));
		estudantes.add(new Estudante("Carlos", 7.2));
		estudantes.add(new Estudante("Daniela", 6.8));
		estudantes.add(new Estudante("Eduardo", 8.5));
		estudantes.add(new Estudante("Fernanda", 9.0));
		estudantes.add(new Estudante("Gustavo", 7.7));
		estudantes.add(new Estudante("Helena", 8.3));
		estudantes.add(new Estudante("Igor", 6.5));
		estudantes.add(new Estudante("Julia", 7.9));
		estudantes.add(new Estudante("Lucas", 7.9));

		Map<Double, List<Estudante>> mapaEstudantes = new HashMap<>();

		for (Estudante estudante : estudantes) {
			double nota = estudante.getNota();
			if (!mapaEstudantes.containsKey(nota)) {
				mapaEstudantes.put(nota, new ArrayList<>());
			}
			mapaEstudantes.get(nota).add(estudante);
		}

		for (Map.Entry<Double, List<Estudante>> entry : mapaEstudantes.entrySet()) {
			double nota = entry.getKey();
			List<Estudante> listaEstudantes = entry.getValue();
			System.out.println("Nota: " + nota);
			for (Estudante e : listaEstudantes) {
				System.out.println(e);
			}
			System.out.println();
		}
	}

}
