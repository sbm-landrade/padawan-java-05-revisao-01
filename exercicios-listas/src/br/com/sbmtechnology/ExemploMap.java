package br.com.sbmtechnology;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class ExemploMap {

    public static void main(String[] args) {
        // Lista de palavras onde palavras podem se repetir
        List<String> listaPalavras = Arrays.asList(
            "teste", "Dev Junior", "teste", 
            "Na minha máquina funciona", "Na minha máquina funciona"
        );
        
        // Mapa para armazenar a frequência das palavras
        Map<String, Integer> frequenciaPalavras = new HashMap<>();
        
        for (String palavra : listaPalavras) {
            if (frequenciaPalavras.containsKey(palavra)) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
            } else {
                frequenciaPalavras.put(palavra, 1);
            }
        }
        
        // Exibir a frequência das palavras
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
