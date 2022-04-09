import java.util.Scanner;

import Perguntas.Pergunta1a7;

public class Main {

	public static void main(String[] args) {
    Pergunta1a7 p = new Pergunta1a7 ();
		
		System.out.println("___________________________________");
		System.out.println("       a- Iniciar       b- Regras");
		System.out.println("___________________________________");
		
		Scanner esc = new Scanner(System.in);
		String opcao = esc.next();
		switch (opcao) {
		case "a":
		 p.Pergunta();
		break;
		case "b":
			System.out.println("Regras");
			break;
		}
	}

}
