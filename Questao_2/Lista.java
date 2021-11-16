package Qustao_2;

import java.util.ArrayList;

public class Lista {
	
	ArrayList<Incluir> cursos;
	
	public Lista() {
		this.cursos = new ArrayList<>();
    }
	
	void insereDisciplina(Incluir novaDisciplina) { // adiciona nessa lista
		cursos.add(novaDisciplina);
	}
	
    void listar() {  
    	System.out.println("Lista:");
    	for(Incluir lista: cursos) { // mostra todos os dados da lista 
    	lista.lista();
    	}
    }

}
