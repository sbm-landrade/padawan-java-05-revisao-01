package br.com.sbmtechnology;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class ElementosUnicos {

	public static void main(String[] args) {
		// Passo 1: Crie uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 5, 11);
        
        Collection<Integer> numerosDuplicados = new HashSet<>(numeros);
        
        System.out.println("Números únicos: " + numerosDuplicados);
        
        }
	}


