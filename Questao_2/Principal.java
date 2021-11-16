package Qustao_2;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		String curso, disciplina = null, estudante;
		int escolhaOpcao = 0, QuantidadeNotas = 0, QuantidadeDisciplinas = 0,pergunta;
		float notas = 0;
		
		
		Incluir aluno = new Incluir(); // Construtor vazio permite que esse objeto seja criado sem passar parametro (ainda não existe)
		Lista listando = new Lista();
		
		
		@SuppressWarnings("resource")
		Scanner usuario = new Scanner (System.in);
		
		 
        do {
          System.out.println( "                 MENU \n " );
          System.out.println( "       | Digite uma das opções abaixo: " );
          System.out.println( "       | 1 - Cadastro / Informacao");
          System.out.println( "       | 2 - Lista " );
          System.out.println( "       | 0 - Sair " );
          System.out.print( " \n     Opção: ");
          
          escolhaOpcao = usuario.nextInt();
          usuario.nextLine(); // Tira o buffer
          
        
		switch (escolhaOpcao) {
        case  1 :
        	
          System.out.print("Curso / Ano letivo: ");
          curso = usuario.nextLine();
                   
          	
          System.out.print("Estudante: ");
          estudante = usuario.nextLine();
          
          aluno = new Incluir (curso,estudante); //construtor com parametro "curso e estudande começou a existir"
          
          System.out.print("Quantidade de disciplinas: ");
          QuantidadeDisciplinas = usuario.nextInt();
          usuario.nextLine();
          
          for(int i = 0; i < QuantidadeDisciplinas; i++) { // 
        	    
          		System.out.print("Cadestre a Disciplina/ sigla /aulas / horario / duracao em horas / Professor: ");
          		disciplina = usuario.nextLine();
          		aluno.insereDisciplinas(disciplina);
          		}
          
          System.out.print("Quantidade de notas: ");
          QuantidadeNotas = usuario.nextInt();
          
          
          	for(int i = 0; i < QuantidadeNotas; i++) {
          		
          		System.out.print("Nota " + (i + 1)+":");
          		notas = usuario.nextFloat();
          		aluno.inserenotas(notas);
          
          	}
          	
          	
        	System.out.print(" \n\nConcluiu todas as disciplinas? 1[SIM] 2[NAO]" );
    		  pergunta = usuario.nextInt();
    		  if(pergunta == 1 ) {
    			  System.out.print("\n     Ex aluno\n\n");

    		  }
          	    listando.insereDisciplina(aluno);
          		aluno.inserenotas(notas);
          		aluno.insereDisciplinas(disciplina);
          		
          break;
        case  2 :
        	listando.listar();
          break;
        case 0:
        	System.out.println("\nOPERAÇÃO ENCERRADA PELO USUÁRIO\n");
        	break;
        default :
        	System.out.println("\nOpção inválida\n");
        }
        
       }while(escolhaOpcao != 0);
}
}
