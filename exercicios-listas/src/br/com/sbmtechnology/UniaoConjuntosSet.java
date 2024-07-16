package br.com.sbmtechnology;

import java.util.HashSet;
import java.util.Set;

public class UniaoConjuntosSet {

	public static void main(String[] args) {
		Set<String> conjunto1 = new HashSet<>();
		conjunto1.add("A");
		conjunto1.add("B");
		conjunto1.add("C");

		Set<String> conjunto2 = new HashSet<>();
		conjunto2.add("B");
		conjunto2.add("C");
		conjunto2.add("D");

		// União
		Set<String> uniao = new HashSet<>(conjunto1);
		uniao.addAll(conjunto2);

		System.out.println("União: " + uniao);
		

        // Interseção
        Set<String> interseccao = new HashSet<>(conjunto1);
        interseccao.retainAll(conjunto2);

        System.out.println("Interseção: " + interseccao);
	}

}
