package exerchabdemotorista;

import java.util.Scanner;

public class habdemotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int deficiente,idoso,gestante; //criando as variaveis//
		
		System.out.println("Digite 1 se ele for Idoso ou 0 se não for"); //aqui a pessoa vai digitar conforme o que ela e//
		idoso = ler.nextInt();
		System.out.println("Digite 1 se ele tiver dificiencia ou 0 se não tiver");
		deficiente = ler.nextInt();
		System.out.println("Digite 1 se ele for gestante ou 0 se não for");
		gestante = ler.nextInt(); //Scanner lendo as variveis criadas//
		
		if( idoso == 1 || gestante == 1 || deficiente == 1) {  //if criado para que caso a pessoa for uma das 3 opcoes podera estaionar se nao caira no else//
			System.out.println("pode estacionar nas vagas especiais "); 
		}else {
			System.out.println("não pode estacionar ");
		}
	   }
	}

