package br.com.sbmtechnology;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exemplo2 {
    public static void main(String[] args) {
        List<String> palavras = List.of("banana", "maçã", "laranja", "banana", "laranja", "banana");

        // Mapa para armazenar a frequência das palavras
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        // Contar a frequência das palavras
        for (String palavra : palavras) {
            if (frequenciaPalavras.containsKey(palavra)) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
            } else {
                frequenciaPalavras.put(palavra, 1);
            }
        }

        // Imprimir a frequência das palavras
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
