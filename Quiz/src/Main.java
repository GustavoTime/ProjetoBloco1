import java.util.Scanner;

import Menu.*;
import Perguntas.Pergunta1a7;
import pessoa.*;

public class Main {

	public static void main(String[] args) {
		Pergunta1a7 p = new Pergunta1a7();
		Apresentador apre = new Apresentador("Esfinderson", "Esfinge");
		MenuFim MFim = new MenuFim();
		Descricao des = new Descricao();
		int i = 0;
		try {
			do {

				System.out.println("__________Misterio da Esfinderson_________________________\n");
				System.out.println("       a- Iniciar       b- Regras      c-Sair");
				System.out.println("__________________________________________________________");

				Scanner esc = new Scanner(System.in);

				char opcao = esc.next().charAt(0);

				switch (opcao) {

					case 'a':
						// recebe o objeto e pega seus atributos
						System.out.println("Brilha que o palco é seuuuuuuu!!!!\n");
						p.recebePessoa(apre);
						MFim.receberPesso(p);
						p.Pergunta();
						MFim.Final();
						i = 11;
						break;
					case 'b':
						des.Msg();
						break;
					case 'c':
						des.Msg("Sair");
						i = 11;
						break;
				}

			} while (i < 10);
		} catch (Error e) {
			System.out.println("Insira um valor valido" + e);
		}
	}
}
