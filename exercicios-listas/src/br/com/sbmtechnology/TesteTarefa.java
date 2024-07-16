package br.com.sbmtechnology;

import java.util.ArrayList;
import java.util.List;

public class TesteTarefa {

	public static void main(String[] args) {
		
		Tarefa t1 = new Tarefa("Tarefa 1", "Arrumar a casa", 20);
		Tarefa t2 = new Tarefa("Tarefa 2", "Estrudar", 19);
		Tarefa t3 = new Tarefa("Tarefa 3", "Tirar o lixo", 25);
		
		List<Tarefa> tarefas = new ArrayList<>();
		tarefas.add(t1);
		tarefas.add(t2);
		tarefas.add(t3);
		
		System.out.println(tarefas);
		
	}

}
