import java.util.Scanner;

//Importa as pastas que tem as classes
import Menu.*;
import PartePerguntas.*;
import pessoa.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("___________________________________");
		System.out.println("       a- Iniciar       b- Regras");
		System.out.println("___________________________________");
		
		Scanner esc = new Scanner(System.in);
		String opcao = esc.next();
		switch (opcao) {
		case "a":
			System.out.println("Come�ou");
		break;
		case "b":
			System.out.println("Regras");
			break;
		}
	}

}
