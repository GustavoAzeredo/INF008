package Questao_1;

import java.util.Scanner;

public class ConversaoDeUnidadeDeArea {
	
	//Questão 1.a - Criar classe de conversão de unidades.
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		double metro2, pe2, centimetro2, milha2, acre;
		
		System.out.println("Digite um valor em metro quadrado:");
		metro2 = teclado.nextDouble();
			
		pe2 = metro2 * 10.76;
		centimetro2 = pe2 * 929;
		acre = pe2 / 43560;
		milha2 = acre / 640;
		
		
		System.out.println("pe2: " + pe2);
		System.out.println("centimetro2: " + centimetro2);
		System.out.println("acre: " + acre);
		System.out.println("milha2: " + milha2);
		
	
	}
}
