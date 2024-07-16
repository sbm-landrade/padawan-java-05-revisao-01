package br.com.sbmtechnology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosPares {

	public static void main(String[] args) {
		// Passo 1: Crie uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
     // Passo 2: Filtre os números pares
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        // Passo 3: Calcule a soma dos números pares
        int soma = 0;
        for (Integer numeroPar : numerosPares) {
            soma += numeroPar;
        }
        
        // Exibir os resultados
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Soma dos números pares: " + soma);
	}
}
