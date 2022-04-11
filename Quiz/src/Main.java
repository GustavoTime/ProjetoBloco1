import java.util.Scanner;

import Menu.*;
import Perguntas.Pergunta1a7;
import pessoa.*;

public class Main {

	public static void main(String[] args) {
		Pergunta1a7 p = new Pergunta1a7();
		Apresentador apre = new Apresentador("Esfinderson", "Esfinge");
		MenuFim MFim = new MenuFim();
		Jogador jo = new Jogador("Cesar", "O aventureiro");
		
		
		MFim.receberPesso(p);
		
		
		System.out.println("__________Misterio da Esfinderson_________________________");
		System.out.println("       a- Iniciar       b- Regras");
		System.out.println("__________________________________________________________");

		Scanner esc = new Scanner(System.in);
		char opcao = esc.next().charAt(0);
		int i = 0;

			switch (opcao) {
			case 'a':
				// recebe o objeto e pega seus atributos
				System.out.println("Brilha que o palco é seuuuuuuu!!!!\n");
				p.recebePessoa(apre);
				p.Pergunta();
				MFim.Final();
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
