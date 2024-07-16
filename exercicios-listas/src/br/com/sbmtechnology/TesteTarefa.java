package br.com.sbmtechnology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteTarefa {

	public static void main(String[] args) {
		
		Tarefa t1 = new Tarefa("Tarefa 1", "Arrumar a casa", 20);
		Tarefa t2 = new Tarefa("Tarefa 2", "Estrudar", 19);
		Tarefa t3 = new Tarefa("Tarefa 3", "Tirar o lixo", 18);
		Tarefa t4 = new Tarefa("Tarefa 4", "Pagar faculdade", 29);
		
		
		List<Tarefa> tarefas = new ArrayList<>();
		tarefas.add(t1);
		tarefas.add(t2);
		tarefas.add(t3);
		
		
		System.out.println(tarefas);
		// Remover tarefa
		tarefas.remove(t2);
        // Adicionar tarefa
		tarefas.add(t4);
		// Atualizar tarefa
        t3.setDescricao("Levar o lixo para fora");
        
        
        System.out.println(tarefas);
        // Ordenar lista de tarefas pela data limite
        Collections.sort(tarefas, Comparator.comparingInt(Tarefa::getDataLimite));
	
		
		 // Exibir lista de tarefas
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
	}

}
