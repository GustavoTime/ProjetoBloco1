import java.util.Scanner;

import Perguntas.Pergunta1a7;
import pessoa.Apresentador;

public class Main {

	public static void main(String[] args) {
		Pergunta1a7 p = new Pergunta1a7();
		Apresentador apre = new Apresentador("Cesar", "o aventureiro");

		System.out.println("__________Misterio da Esfinderson_________________________");
		System.out.println("       a- Iniciar       b- Regras");
		System.out.println("__________________________________________________________");

		Scanner esc = new Scanner(System.in);
		char opcao = esc.next().charAt(0);
		int i = 0;

			switch (opcao) {
			case 'a':
				// recebe o objeto e pega seus atributos
				p.recebePessoa(apre);
				p.Pergunta();
				break;
			case 'b':
				System.out.println("Regras");
				break;
			default:
				i=100;
				break;
			}
		
	}

}
