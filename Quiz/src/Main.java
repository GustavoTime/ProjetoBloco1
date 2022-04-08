import Menu.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MenuFim mf = new MenuFim();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um valor");
		int n = ler.nextInt();
		
		mf.ContAcertosErros(n, n);
		
	}

}
