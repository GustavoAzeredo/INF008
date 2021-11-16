package Qustao_2;

import java.util.ArrayList;

public class Incluir {
	
	private String curso; 
	private String estudante;
	 
	 
	 ArrayList<String> disciplinas = new ArrayList<>();
	 
	 ArrayList<Float> notasAlunos = new ArrayList<>();
	 
	 public Incluir() {//construtor vazio
		 
	 }
	 

	 
	 public Incluir (String curso, String estudante) { // contrutor com parametro
		 setCurso(curso);
		 setEstudante(estudante);
	 }
	 void insereDisciplinas(String disciplina) { 
		 disciplinas.add(disciplina);
	 }
	 void inserenotas(float notas) {
		 notasAlunos.add(notas);
	 }

	public String getCurso() { //os atributos (estudante e curso) são privadas e o get e set permitem passar essas informações aos atributos
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEstudante() {
		return estudante;
	}

	public void setEstudante(String estudante) {
		this.estudante = estudante;
	}
	
	void lista() {
		System.out.println("\nCurso:"+this.curso);
		System.out.println("\nEstudante:"+this.estudante);
		
		for(int i = 0; i < disciplinas.size(); i++ ) {// pega a quantidade digitada pelo usuario 
			System.out.println((i + 1)+"º - Disciplina (cod:"+ (20211 + i)+"): " + this.disciplinas.get(i)); //pega(get) a inforação dessa(this) disciplina na posição i
		}
		
		for(int i = 0; i < notasAlunos.size() - 1; i++ ) { // pega a quantidade digitada pelo usuario 
			System.out.println("\nNota " + (i + 1) + ": " + this.notasAlunos.get(i)); //pega(get) a informação dessa(this) notas alunos na posição i
		}
		
	}

	public ArrayList<Float> getNotasAlunos() {
		return notasAlunos;
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void setNotasAlunos(ArrayList<Float> notasAlunos) {
		this.notasAlunos = notasAlunos;
	}
	  
}
